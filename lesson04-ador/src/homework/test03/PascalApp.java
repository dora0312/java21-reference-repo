package homework.test03;

import java.util.Scanner;

public class PascalApp {
	public static void main(String[] args) {
		int[][] pascalArr;
		Scanner sc = new Scanner(System.in);
		int index;
		do {
			System.out.print("Input number size of array: ");
			index = Integer.parseInt(sc.nextLine());
		}while(index < 1 || index > 20);
		sc.close();
		
		pascalArr = new int[index + 1][index + 2];
		for(int row = 0; row < pascalArr.length; row++) {
			for(int column = 0; column < pascalArr[0].length; column++) {
				pascalArr[row][column] = 0;
			}
		}
		pascalDraw(pascalArr);
		printArrayInfo(pascalArr);
	}
	
	private static void printArrayInfo(int[][] pascalArr) {
		for(int row = 0; row < pascalArr.length; row++) {
			for(int column = 0; column < pascalArr[0].length; column++) {
				if( pascalArr[row][column] != 0) {
					if(pascalArr[row][column] < 10) {
						System.out.print(pascalArr[row][column] + "   ");
					} else {
						System.out.print(pascalArr[row][column] + "  ");
					}
				}
			}
			System.out.println("");
		}
	}
	
	private static void pascalDraw(int[][] pascalArr) {
		for(int row = 0; row < pascalArr.length; row++) {
			for(int column = 0; column < pascalArr[0].length; column++) {
				if( column == 0 ) {
					pascalArr[row][column] = 1;
				} else if( column == (row + 1) ) {
					pascalArr[row][column] = 1;
					break;
				} else {
					int tempData = pascalArr[row - 1][column] + pascalArr[row - 1][column - 1];
					pascalArr[row][column] = tempData;
				}
			}
		}
	}
}
