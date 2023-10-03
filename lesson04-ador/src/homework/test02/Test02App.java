package homework.test02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test02App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index;
		do {
			System.out.print("Input number size of array: ");
			index = Integer.parseInt(sc.nextLine());
		}while(index < 1 || index > 20);
		sc.close();
		
		//index = 11;
//		int[] array = new int[] {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int[] array = new int[index];
		
		for(int i = 0; i < index; i ++) {
			array[i] = new Random().nextInt(4, 101);			
		}
		
		System.out.println("Check Before: " + Arrays.toString(array));
		for(int num = 0; num < array.length; num++) {
			System.out.println(array[num]+"/7 = " + (array[num]%7 == 0) + "; /5 = " + (array[num]%5 == 0));
		}
		checkArray(array);
		System.out.println("Check after: " + Arrays.toString(array));
	}
	private static void checkArray(int[] array) {
		int temp = 0;
		int indexLeft = 0;
		int indexRight = array.length - 1;
		for(int i = 0; i <= indexRight; i++) {
			if( (array[i] % 7 == 0) && (array[i] % 5 != 0) ) {
				temp = array[indexLeft];
				array[indexLeft] = array[i];
				array[i] = temp;
				indexLeft++;
				i--;
			} else if( (array[i] % 5 == 0) && (array[i] % 7 != 0) ) {
				temp = array[indexRight];
				array[indexRight] = array[i];
				array[i] = temp;
				indexRight--;
				i--;
			}
		}
	}
}
