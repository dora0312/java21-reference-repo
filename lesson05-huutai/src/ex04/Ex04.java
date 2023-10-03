package ex04;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 17, 21};
		a = getUniqueNumbers(a);

		// sort
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	private static boolean isExists(int number, int[] numbers, int index) {
		for(int i = 0; i < numbers.length; i++) {
			if(number == numbers[i] && i != index) {
				return true;
			}
		}
		
		return false;
	}
	
	private static int[] getUniqueNumbers(int[] arr) {
		int[] array = new int[arr.length];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(!isExists(arr[i], arr, i)) {
				array[count] = arr[i];
				count++;
			}
		}
		
		return Arrays.copyOfRange(array, 0, count);
	}
}
