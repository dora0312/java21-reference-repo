package bai01;

public class Bai01 {
	public static void main(String[] args) {
		int num1 = 4, mun2 = 64;
		System.out.println("Có phải là lũy thừa của một số khác không: " + isPowerOf(num1, mun2));
	}
	private static boolean isPowerOf(int num1, int mun2) {
		int exponentNum = 1;
		int inputNum, expNum;
		boolean checkNum = false;
		
		if( num1 > mun2) {
			inputNum = num1;
			expNum = mun2;
		} else {
			inputNum = mun2;
			expNum = num1;
		}
		
		checkNum = inputNum % expNum == 0 ? true : false;
		if(checkNum == false) {
			return false;
		}
		
		for(int count = inputNum; count > expNum ; ) {
			if(count % expNum == 0) {
				count = count / expNum;
				exponentNum++;
			} else {
				break;
			}
		}
		
		if(exponentNum != 1) {
			if(Math.pow(expNum, exponentNum) == inputNum) {
				return true;
			}
		}
		return false;
	}
}
