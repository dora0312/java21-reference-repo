package test04;

import static ultils.StringUltils.*;

import java.util.Scanner;

import ultils.StringValidExceptionUltils;

public class App04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Mời nhập username: ");
		String userName = inputYourString(false, null, ip);
		System.out.print("Mời nhập password: ");
		String pass = inputYourString(true, userName, ip);
		System.out.println("************* Tài khoản đăng ký thành công *************");
		System.out.println("Thông tin tai khoản: "
							+ "\n        Username: " + userName
							+ "\n            pass: " + pass);
		ip.close();
	}
	private static String inputYourString(boolean verify, String required, Scanner ip) {
//		Scanner ip = new Scanner(System.in);
		String yourString = "";
		do {
			try {
				yourString = ip.nextLine();
				if (verify) {
					isValidString(yourString, required);
				}
				break;
			} catch (StringValidExceptionUltils e) {
				System.out.println(e.getMessage());
				System.out.print("\nMời nhập lại: ");
			}
			
			
		} while (true);
		
		//ip.close();
		return yourString;
	}
	private static void isValidString(String pass, String required) throws StringValidExceptionUltils {
		if(!verifyStringLenght(pass, 8, Integer.MAX_VALUE)) {
			throw new StringValidExceptionUltils("!!! Mật khẩu phải có độ dài >= 8 !!!");
		}
		// kiểm tra có chứa số không ?
		if(!verifyExistNumber(pass)) {
			throw new StringValidExceptionUltils("!!! Mật khẩu phải có ít nhất 1 chữ số (0~9) !!!");
		}
		// Kiểm tra kí tự in Hoa
		if(!verifyExistUppercase(pass)) {
			throw new StringValidExceptionUltils("!!! Mật khẩu phải có ít nhất 1 ký tự in HOA (A~Z) !!!");
		}
		// Kiểm tra kí tự in Hoa
		if(!verifyExistSpecialSymbols(pass)) {
			throw new StringValidExceptionUltils("!!! Mật khẩu phải có ít nhất 1 ký tự đặc biệt(@!%$,..) !!!");
		}
		// Kiểm tra trùng với username
		int count = 0;
		pass = pass.toLowerCase();
		required = required.toLowerCase();
		for(int i = 0; i < pass.length(); i++) {
			String ch = pass.charAt(i) + "";
			if(required.contains(ch)) {
				int exitNum = required.length() - required.replaceAll(ch,"").length();
				count += exitNum;
			}
			if(count >= 3) {
				throw new StringValidExceptionUltils("!!! Mật khẩu không được trùng 3 ký tự với username !!!");
			}
		}
	}
}
