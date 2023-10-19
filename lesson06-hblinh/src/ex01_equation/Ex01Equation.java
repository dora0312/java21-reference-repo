package ex01_equation;

import java.util.Scanner;

public class Ex01Equation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		int d = 0;
		do {
			System.out.println("Enter number a: ");
			String a = sc.nextLine();
			System.out.println("Enter number b: ");
			String b = sc.nextLine();
			
			
			try {
				c = Integer.parseInt(a);
				d = Integer.parseInt(b);
				int f = 1/d;
				break;
				
			} catch (Exception e) {
				System.out.println("Nhập giá trị không hợp lệ. Vui lòng nhập lại !");
			}
		} while(true);
		equation(c, d);
	}
	private static void equation(double a, double b) {
		double x = -b/a;
		x = (double) Math.ceil(x * 10) / 10;
		System.out.println("Kết quả x = -b/a = "+x);
	} 
}
