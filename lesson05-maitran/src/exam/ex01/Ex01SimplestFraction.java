package exam.ex01;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01SimplestFraction {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int max = 3;
		String text = "";
		
		do {
			System.out.println("Enter number: ");
			text = ip.nextLine();
			max--;
			if (max < 1) {
				System.out.println("Maximum attempts reached.");
				return;
			}
			ip.close();
		} while (!isDecimalNumber(text));

		double number = Double.parseDouble(text);
		BigDecimal bigDec = bd(number);
		System.out.println(findSimplestFraction(bigDec));
		
	}

	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}

	private static boolean isDecimalNumber(String text) {
		String regex = "^[+-]?\\d*\\.?\\d+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		return matcher.matches();
	}

	private static String findSimplestFraction(BigDecimal number) {
		BigDecimal numerator = number.multiply(bd(10000));
		BigDecimal denominator = bd(10000);

		BigInteger numeratorBI = numerator.toBigInteger();
		BigInteger denominatorBI = denominator.toBigInteger();

		BigInteger gcd = numeratorBI.gcd(denominatorBI);

		numeratorBI = numeratorBI.divide(gcd);
		denominatorBI = denominatorBI.divide(gcd);

		return numeratorBI + "/" + denominatorBI;
	}
}
