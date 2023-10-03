package exam.ex02;

import java.util.Scanner;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = ip.nextInt();
		System.out.println(isSpecialNumber(number));
		ip.close();
	}
	
	private static boolean isSpecialNumber(int n) {
		int sum = 0;
		for(int i = 1; sum < n; i++) {
			sum += i;
		}
		return sum == n;
	}
}
