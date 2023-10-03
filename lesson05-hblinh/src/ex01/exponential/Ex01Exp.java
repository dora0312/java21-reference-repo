package ex01.exponential;

import java.util.Scanner;

public class Ex01Exp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Nhập số thứ nhất: ");
		Integer n1 = sc.nextInt();
		System.out.println("Nhập số thứ hai: ");
		Integer n2 = sc.nextInt();
		isPowerOf(n1, n2);
	}
	public static void isPowerOf(Integer n1, Integer n2) {
		if(n1==n2*n2*n2||n2==n1*n1*n1) {
			System.out.println("true");
		} else System.out.println("false");
	}
}
