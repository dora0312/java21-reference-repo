package homework;

import java.util.Random;

public class Test10 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];
		int index = 0;

		arr[index] = rd.nextInt(20, 31);
		index++;
		
		do {
			boolean flag = true;
			int number = rd.nextInt(20, 31);
			for(int i = 0; i < index; i++) {
				if (number == arr[i]) {
					flag = false;
					break;
				}
			}
			if( flag == true ) {
				arr[index] = number;
				index++;
			}
		} while( index < 5);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Arr[" + i + "]: " + arr[i]);
		}
	}

}
