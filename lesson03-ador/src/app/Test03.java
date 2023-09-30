package app;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int [][] horseArr;
		int row = 0, column = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhập SỐ HÀNG của mảng >=1 or <= 20: ");
			row = Integer.parseInt(sc.nextLine());
		}while(row < 1 || row > 20);
		
		do {
			System.out.print("Nhập SỐ CỘT của mảng >=1 or <= 20: ");
			column = Integer.parseInt(sc.nextLine());
		}while(column < 1 || column > 20);
		
		sc.close();
		horseArr = new int[row][column];
		for(int i = 0; i < horseArr.length; i++) {
			for(int j = 0; j < horseArr[0].length; j++) {
				horseArr[i][j] = new Random().nextInt(0, 100);
			}
		}
			
//		horseArr[0][0] = 36;
//		horseArr[0][1] = 5;
//		horseArr[0][2] = 48;
//		
//		horseArr[1][0] = 23;
//		horseArr[1][1] = 2;
//		horseArr[1][2] = 31;
//		
//		horseArr[2][0] = 15;
//		horseArr[2][1] = 7;
//		horseArr[2][2] = 29;
		
		printAllArray(horseArr);
		System.out.println("Số yên ngựa: " + (checkHorseNum(horseArr) != 0 ? checkHorseNum(horseArr) : "Không có"));
	}
	private static void printAllArray(int[][] horseArr) {
		for(int row = 0; row < horseArr.length; row++) {
			for(int column = 0; column < horseArr[0].length; column++) {
				if(horseArr[row][column] < 10) {
					System.out.print(horseArr[row][column] + "   ");
				} else {
					System.out.print(horseArr[row][column] + "  ");
				}
			}
			System.out.println("");
		}
	}
	
	private static int checkHorseNum(int[][] horseArr) {
		int rowMin = 0, columnMin = 0;
		int horseNum = 0;
		for(int row = 0; row < horseArr.length; row++) {
			horseNum = horseArr[row][0];
			for(int column = 1; column < horseArr[0].length; column++) {
				if(horseNum > horseArr[row][column]) {
					horseNum = horseArr[row][column];
					rowMin = row;
					columnMin = column;
				}
			}
			for(int rowHorse = 0; rowHorse < horseArr.length; rowHorse++) {
				if( (rowHorse != rowMin) && (horseArr[rowHorse][columnMin] >= horseNum)) {
					horseNum = 0;
					break;
				}
			}
			if(horseNum != 0) {
				break;
			}
		}
		return horseNum;
	}
}
