package Ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Nhập:");
				double a = Integer.parseInt(ip.nextLine());
				double b = Integer.parseInt(ip.nextLine());
				System.out.println("Nghiệm của phương trình: " + equation(a, b));
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("ef -> " + e.getMessage());
			}
		}
	}

	private static double equation(double a, double b) {
		if (a == 0) {
			throw new ArithmeticException("e -> / by zero");
		}
		return -b / a;

	}
}
