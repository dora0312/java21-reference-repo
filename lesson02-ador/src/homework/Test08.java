package homework;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yourInput = "";
		int inputData = 0;
		boolean isPrimeNum = false;
		int inputOfTime = 0;

		do {
			System.out.print("Nhập số nguyên cần kiểm tra: ");
			yourInput = sc.nextLine();
			if(!yourInput.matches("\\d+") && (inputOfTime < 4)) {
				System.out.println("\n==>>Bạn nhập sai ! Hãy nhập số NGUYÊN DƯƠNG<<==");
			}
			inputOfTime++;
		} while(!yourInput.matches("\\d+") && (inputOfTime < 5));
		
		if (yourInput.matches("\\d+") && (inputOfTime <= 5)) {
			inputData = Integer.parseInt(yourInput);
			isPrimeNum = isPrimeNumFunc(inputData);
			System.out.println("Number is Prime Number ? => " + isPrimeNum);
		} else {
			System.out.println("==>>Bạn đã nhập sai quá " + inputOfTime + " lần<==");
		}
		System.out.println("=======Finished system=======");
		sc.close();
	}
    public static boolean isPrimeNumFunc(int inputData) {
        if (inputData < 2) {
            return false;
        }
        for (int i = 2; i <= (inputData / 2) ; i++) {
            if (inputData % i == 0) {
                return false;
            }
        }
        return true;
    }
}
