package test04;

import java.util.Scanner;

public class ReadNumber {
	private static String[] readNum = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
										"mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu",
										"mười bảy", "mười tám", "mười chín"};
	public static void main(String[] args) {
		Scanner ip  = new Scanner(System.in);
		int number = 0;
		do {
			System.out.print("Nhập số nguyên cần đọc: ");
			String str = ip.nextLine();
			try {
				number = checkSizeOfNumber(str);
				String readToWord = readNumber(number);
				readToWord = readToWord.substring(0,1).toUpperCase() + readToWord.substring(1);
				System.out.println("Số " + number + " đọc là: " + readToWord);
				break;
			} catch (VerifyNumException e) {
				System.out.println(e.getMessage());
			}
			
		} while(true);
		ip.close();
	}
	
	private static int checkSizeOfNumber(String num) throws VerifyNumException {
		
		int input = 0;
		try {
			input = Integer.parseInt(num);
			if(input > 999 || input < -999) {
				throw new VerifyNumException("Xin vui lòng nhập tối đa 3 số nguyên dương !!!");
			}
			return input;
		} catch (ArithmeticException | NumberFormatException e) {
			throw new VerifyNumException("Xin vui lòng nhập SỐ NGUYÊN DƯƠNG !!!");
		}
	}
	
	
	private static String readNumber(int num) {
		String toRead = "";
		if(num < 0) {
			toRead += "âm ";
			num = Math.abs(num);
		}
		int numcheck = num / 100;
		if(numcheck > 0) {
			toRead += readNum[numcheck] + " trăm ";
		}
		numcheck = num / 10;
		if (numcheck >= 2) {
			int checkLe = num % 100;
			if(checkLe == 0) {
				// not thing
			} else if (checkLe < 10) {
				toRead += "lẻ ";
			} else if (checkLe >= 20) {
				toRead += readNum[numcheck % 10] + " mươi ";
			}
		}
		numcheck = num % 100;
		if (numcheck >= 20 ) {
			if (numcheck % 10 != 0) {
				toRead += readNum[numcheck % 10];
			}
		} else if (numcheck > 0) {
			toRead += readNum[numcheck];
		}
		if ( num == 0 ) {
			toRead = readNum[num];
		}
		return toRead;
	}
	
}
