package homework;

import java.util.Scanner;

public class Test02 {
	static final int expNum = 2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yourInput = "";
		int inputData = 0;
		boolean isExpNum = false;
		int inputOfTime = 0;
		
		// Nếu nhập String nhập lại và số lần nhập quá 5 thì sẽ finished
		do {
			System.out.print("Nhập số nguyên dương lũy thừa của " + expNum + ": ");
			yourInput = sc.nextLine();
			if(!yourInput.matches("\\d+") && inputOfTime < 4) {
				System.out.println("\n==>>Bạn nhập sai ! Hãy nhập số NGUYÊN DƯƠNG<<==");
			}
			inputOfTime++;
		} while(!yourInput.matches("\\d+") && (inputOfTime < 5));
		
		if (yourInput.matches("\\d+") && (inputOfTime <= 5)) {
			inputData = Integer.parseInt(yourInput);
			isExpNum = checkExponentialNum(inputData);
			System.out.println("Number is facnumber ? => " + isExpNum);
		} else {
			System.out.println("==>>Bạn đã nhập sai quá " + inputOfTime + " lần<==");
		}
		System.out.println("=======Finished system=======");
		sc.close();
	}
	private static boolean checkExponentialNum(int inputData) {
		int exponentNum = 1;
		for(int count = inputData; count > expNum ; ) {
			if(count % expNum == 0) {
				count = count / expNum;
				exponentNum++;
			} else {
				break;
			}
		}
		
		if(exponentNum != 1) {
			if(Math.pow(expNum, exponentNum) == inputData) {
				return true;
			}
		}
		return false;
	}
}
