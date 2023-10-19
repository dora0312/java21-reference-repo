package homework.bai4;

import java.util.Scanner;

public class App04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		do {
			try {
				System.out.print("Nhập số có tối đa 3 chữ số (0 < n < 999): ");
				number = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Lỗi --> Dữ liệu phải là 1 số nguyên (0 < n < 999). Vui lòng thử lại !");
			}
		} while (true);
//		System.out.println((number % 100));
		System.out.println(readNumber(number));
		scanner.close();
	}

	private static String readNumber(int number) {
		String[] units = { "", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };
		String[] tens = { "", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi",
				"Chín mươi" };

		int hundreds = number / 100;
		int tensPart = (number % 100) / 10;
		int ones = number % 10;

		StringBuilder words = new StringBuilder();

		if (hundreds > 0) {
			words.append(units[hundreds]).append(" trăm");
			if (tensPart == 0 && ones > 0) {
				words.append(" linh");
			}
		}

		if (tensPart > 0) {

			if (hundreds > 0) {
				words.append(" ");
			}
			words.append(tens[tensPart]);
		}

		if (ones > 0) {
			if (hundreds > 0 || tensPart > 0) {
				words.append(" ");
			}
			words.append(units[ones]);
		}

		return words.toString();
	}
}
