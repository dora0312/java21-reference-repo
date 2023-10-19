package test02;

import java.util.Scanner;

public class VerifyPassPrograming {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String inputPass = "";
		System.out.print("Enter your password: ");
		do {
			try {
				inputPass = ip.nextLine();
//				System.out.println("Length: " + inputPass.length());
//				System.out.println("UPPER: " + inputPass.matches(".*[A-Z].*"));
//				System.out.println("lower: " + inputPass.matches(".*[a-z].*"));
//				System.out.println("number: " + inputPass.matches(".*\\d.*"));
//				System.out.println("symbols: " + inputPass.matches(".*\\W.*"));
				verifyPassLen(inputPass);
				verifyLowercase(inputPass);
				verifyUppercase(inputPass);
				verifyNum(inputPass);
				verifySymbols(inputPass);
				System.out.println("Create password is successful");
				System.out.println("Password has been sent to your email");
				break;
			} catch (VerifyException e) {				
				System.out.println(e.getMessage());
				System.out.print("Please input your password again: ");
			}
		}while(true);
		ip.close();
		System.out.println("=====Finished=====");
	}
	private static void verifyPassLen(String yourPass) throws VerifyException {
		if(yourPass.length() < 8) {
			throw new VerifyException("At least 8 characters !!!");
		} else if(256 < yourPass.length()) {
			throw new VerifyException("At most 256 characters !!!");
		}
	}
	private static void verifyLowercase(String yourPass) throws VerifyException {
		if (!yourPass.matches(".*[a-z].*")) {
			throw new VerifyException("At least 1 lowercase alphabetic character(a, b, c,...) !!!");
		}
	}
	private static void verifyUppercase(String yourPass) throws VerifyException {
		if (!yourPass.matches(".*[A-Z].*")) {
			throw new VerifyException("At least 1 UPPERCASE alphabetic character(A, B, C,...) !!!");
		}
	}
	private static void verifyNum(String yourPass) throws VerifyException {
		if (!yourPass.matches(".*\\d.*")) {
			throw new VerifyException("At least 1 number(1, 2, 3,...) !!!");
		}
	}
	private static void verifySymbols(String yourPass) throws VerifyException {
		if (!yourPass.matches(".*\\W.*")) {
			throw new VerifyException("At least 1 special character(~,$,#,%,@,... !!!");
		}
	}
}
