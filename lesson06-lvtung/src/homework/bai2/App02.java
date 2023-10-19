package homework.bai2;

import java.util.Scanner;
import homework.exception.ValidationException;

public class App02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isValid = false;
		
		do {
			try {
				System.out.print("Nhập mật khẩu: ");
				String password = scanner.nextLine();
				isPasswordValid(password);
				isValid = true;
				System.out.println("Mật khẩu hợp lệ. Đăng ký tài khoản thành công!");
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		} while (!isValid);
		
		scanner.close();
	}

	public static void isPasswordValid(String password) throws ValidationException {
		// Kiểm tra độ dài mật khẩu
		if (password.length() < 8 || password.length() > 256) {
			throw new ValidationException("Mật khẩu phải có ít nhất 8 và nhiều nhất 256 ký tự.");
		}

		// Kiểm tra chứa ít nhất 1 chữ cái viết thường
		if (!password.matches(".*[a-z].*")) {
			throw new ValidationException("Mật khẩu phải chứa ít nhất 1 ký tự thường.");
		}

		// Kiểm tra chứa ít nhất 1 chữ cái viết hoa
		if (!password.matches(".*[A-Z].*")) {
			throw new ValidationException("Mật khẩu phải chứa ít nhất 1 ký tự hoa.");
		}

		// Kiểm tra chứa ít nhất 1 số
		if (!password.matches(".*\\d.*")) {
			throw new ValidationException("Mật khẩu phải chứa ít nhất 1 số.");
		}

		// Kiểm tra chứa ít nhất 1 ký tự đặc biệt
		if (!password.matches(".*[!@#$%^&+=].*") ) {
			throw new ValidationException("Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt.");
		}
	}
}
