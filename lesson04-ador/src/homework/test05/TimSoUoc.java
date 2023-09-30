package homework.test05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TimSoUoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index;
		do {
			System.out.print("Input number size of array: ");
			index = Integer.parseInt(sc.nextLine());
		}while(index < 3 || index > 20);
		sc.close();
		System.out.print("Array before sort: ");
		int[] array = new int[index];
		for(int i = 0; i < index; i ++) {
			array[i] = new Random().nextInt(0, 100);
			System.out.print(array[i] +"; ");
			
		}
		System.out.println("");
		SoUocStrategy findUocNum = (arrStrategy) -> {
			findNum(arrStrategy);
		};
		toDoArray(array, findUocNum);
		
		SoUocStrategy sortNum = (arrStrategy) -> {
			sortArray(arrStrategy);
		};
		toDoArray(array, sortNum);
		
	}
	
	private static void toDoArray(int[] array, SoUocStrategy soUocStrategy) {
		soUocStrategy.process(array);
	}
	
	private static void findNum(int[] array) {
		for(int num:array) {
			int count = 0;
			for(int i = num; i > 0; i--) {
				if((num % i) == 0) {
					count++;
				}
			}
			System.out.println(" .Số " + num + " có " + count +" level");
		}
	}
	
	private static void sortArray(int[] array) {
		Arrays.sort(array);
		System.out.println("Sort after: " + Arrays.toString(array));
	}
}
