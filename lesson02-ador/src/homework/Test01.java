package homework;

import java.util.Scanner;

public class Test01 {
	static final int multipleNum = 2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yourInput = "";
		int inputData = 0;
		boolean isMulNum = false;
		int inputOfTime = 0;
		
		// Nếu nhập String nhập lại và số lần nhập quá 5 thì sẽ finished
		do {
			System.out.print("Nhập số nguyên dương bội của " + multipleNum + ": ");
			yourInput = sc.nextLine();
			if(!yourInput.matches("\\d+") && inputOfTime < 4) {
				System.out.println("\n==>>Bạn nhập sai ! Hãy nhập số NGUYÊN DƯƠNG<<==");
			}
			inputOfTime++;
		} while(!yourInput.matches("\\d+") && (inputOfTime < 5));
		
		if (yourInput.matches("\\d+") && (inputOfTime <= 5)) {
			inputData = Integer.parseInt(yourInput);
			isMulNum = isMultipleNumFuc(inputData);
			System.out.println("Số bạn vừa nhập " + (String)(isMulNum==true ? "là":"KHÔNG là") 
					+ " bội của số " + multipleNum + "\n");
		} else {
			System.out.println("==>>Bạn đã nhập sai quá " + inputOfTime + " lần<==");
		}
		System.out.println("=======Finished system=======");
		sc.close();
	}
	private static boolean isMultipleNumFuc(int inputData) {
		if( (inputData % multipleNum) == 0 ) {
			return true;
		}
		return false;
	}
}
