package homework;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yourInput = "";
		String[] label = {"a", "b", "c"};
		int[] inputData = new int[3];
		int index = 0;
		
		do {
			System.out.print("Nhập số nguyên dương cho " + label[index] +": ");
			yourInput = sc.nextLine();
			if(!yourInput.matches("\\d+")) {
				System.out.println("\n==>>Bạn nhập sai ! Hãy nhập số NGUYÊN DƯƠNG<<==");
			} else {
				int valueCheck = Integer.parseInt(yourInput);
				if (valueCheck < 20 ) {
					inputData[index] = valueCheck;
					index++;
				} else {
					System.out.println("\n==>>Bạn nhập sai ! Hãy nhập số NGUYÊN DƯƠNG từ 0 đến 20<<==");
				}
			}
		} while(!yourInput.matches("\\d+") || index < 3);
		
		System.out.print("Các số nguyên dương đã nhập là: ");
		for(int i = 0; i < label.length; i++) {
			System.out.print(label[i] + " = " + inputData[i] + "; ");
		}
		System.out.println("\nSố lớn nhất là: " + findMax(inputData) + "\nSố nhỏ nhất là: " + findMin(inputData));
		sc.close();
	}
	private static int findMax(int [] array) {
		int max = 0;

		for(int i=0; i<array.length; i++ ) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	private static int findMin(int [] array) {
		int min = array[0];
		
		for(int i=0; i<array.length; i++ ) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
}
