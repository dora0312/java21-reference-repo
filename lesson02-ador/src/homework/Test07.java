package homework;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yourInput = "";
		int inputData = 0;
		
		do {
			System.out.print("Nhập số nguyên dương cần quy đổi thành số nhị phân: ");
			yourInput = sc.nextLine();
			if(!yourInput.matches("\\d+")) {
				System.out.println("\n==>>Bạn nhập sai ! Hãy nhập số NGUYÊN DƯƠNG<<==");
			}
		} while(!yourInput.matches("\\d+"));
		
		inputData = Integer.parseInt(yourInput);
		decToBinFunc(inputData);
		sc.close();
	}
	private static void decToBinFunc(int inputData) {
		int divNum = inputData;
		String binNum = "";
		do {
			binNum = String.valueOf(divNum % 2) + binNum;
			divNum /= 2;
		} while(divNum > 0);
		
		System.out.println("Dec " + inputData + " to Bin: " + binNum);
	}
}
