package homework.bai1;

import java.util.Scanner;

public class App01 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("PT: aX + b = 0");
		System.out.println("Result(-b/a): " + enterNumberAndCalculator());
	}

	private static double enterNumberAndCalculator() {
		double a = 0, b = 0;
		do {
			try {
				a = input("Enter a");
				if (a > 0 || a < 0) {
					break;
				}
				System.out.println("Lỗi: Không thể chia cho 0. Giá trị a phải khác 0.");
			} catch (NumberFormatException e) {
				System.out.println("error --> dữ liệu nhập vào phải là số nguyên !");
			}
		} while (true);

		do {
			try {
				b = input("Enter b");
				break;
			} catch (NumberFormatException e) {
				System.out.println("error --> dữ liệu nhập vào phải là số nguyên !");
			}
		} while (true);

		return -b / a;
	}

	private static double input(String text) {
		System.out.print(text + ": ");
		return Double.parseDouble(scanner.nextLine());
	}
}
