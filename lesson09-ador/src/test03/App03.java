package test03;

import static ultils.StringUltils.*;

import java.util.Scanner;

import ultils.StringValidExceptionUltils;

public class App03 {
	public static void main(String[] args) {
		String yourString = inputYourString();
		yourString = yourString.strip();
		
		String[] words = yourString.strip().split("\\s+");
		String revertStr = "";
		for(String s: words) {
			revertStr += revert(s) + " ";
		}
		revertStr = revertStr.strip();
		System.out.println(revertStr);
	
	}
	
	private static String revert(String s) {
		return new StringBuffer(s).reverse().toString();
	}
	
	private static String inputYourString() {
		Scanner ip = new Scanner(System.in);
		String yourString = "";
		System.out.println("*** Nhập chuỗi thường và có khoảng trống ***");
		System.out.print("Mời nhập chuỗi: ");
		do {
			yourString = ip.nextLine();
			try {
				isValidString(yourString);
				break;
			} catch (StringValidExceptionUltils e) {
				System.out.println(e.getMessage());
				System.out.print("\nMời nhập lại chuỗi: ");
			}
			
			
		} while (true);
		
		ip.close();
		return yourString;
	}
	
	private static void isValidString(String yourStr) throws StringValidExceptionUltils {
		// có chứa khoảng trắng không ?
		yourStr = yourStr.strip().replaceAll("\\s+", " ");
		if(!verifyExistBlank(yourStr)) {
			throw new StringValidExceptionUltils("!!! Các từ cách nhau ít nhất MỘT KHOẢNG TRỐNG !!!");
		}
	}
}
