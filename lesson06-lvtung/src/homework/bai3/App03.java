package homework.bai3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homework.exception.ValidationException;

public class App03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isValid = false;
		
		do {
			try {
				System.out.print("Nhập email: ");
				String email = scanner.nextLine();
				isEmailValid(email);
				isValid = true;
				System.out.println("Địa chỉ email: "+ email +" hợp lệ");
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		} while (!isValid);

		scanner.close();
	}

	private static void isEmailValid(String email) throws ValidationException {
		String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(email);
		
		if (!matcher.matches()) {
			throw new ValidationException("Địa chỉ email không hợp lệ. Vui lòng nhập lại");
		}
	}

}
