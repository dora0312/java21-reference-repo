package Ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Nhập mật khẩu: ");
				String password = ip.nextLine();
				checkLeastAndMost(password);
				checkAlphabetic(password);
				checkNumber(password);
				checkSpecial(password);
				System.out.println("Tạo mật khẩu thành công");
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("ef -> " + e.getMessage());
			}
		}

	}

	private static void checkLeastAndMost(String password) {
		if (password.length() < 8) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 8 ký tự");
		} else if (password.length() > 256) {
			throw new IllegalArgumentException("Mật khẩu không quá 256 ký tự");
		}
	}

	private static void checkAlphabetic(String password) {
		
		if (!password.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("Có ít nhất 1 ký tự viết hoa");
		} else if (!password.matches(".*[a-z].*")) {
			throw new IllegalArgumentException("Có ít nhất 1 ký tự viết thường");
		}
	}
	
	private static void checkNumber(String password) {
		
		if (!password.matches(".*[0-9].*")) {
			throw new IllegalArgumentException("Có ít nhất 1 ký tự số");
		}
	}
	
	private static void checkSpecial(String password) {
		
		if (!password.matches(".*[^a-zA-Z0-9].*")) {
			throw new IllegalArgumentException("Có ít nhất 1 ký tự đặc biệt");
	}
	}

}
