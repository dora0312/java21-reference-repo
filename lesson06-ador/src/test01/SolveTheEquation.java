package test01;

import java.util.Scanner;

public class SolveTheEquation {
	public static void main(String[] args) {
		int a = 0, b = 0;
		int result = 0;
		System.out.println("Ta có phương trình: ax + b = 0");
		a = inputNum("a");
		b = inputNum("b");
		do {
			try {
				result = (-b)/a;
				break;
			} catch (ArithmeticException e) {
				System.out.println("Bạn đang chia một số nguyên cho 0 !!!!");
				a = inputNum("a");
			}		
		} while(true);
		
		System.out.println("Kết quả của phương trình ax + b = 0; với a = " + a + "; b = " + b + ";"
				+ "\nKết quả: x = " + result);
		
	}
	private static int inputNum(String target) {
		Scanner ip = new Scanner(System.in);
		int input = 0;
		do {
			try {
				System.out.print("Hãy nhập giá trị cho " + target + " : ");
				input = Integer.parseInt(ip.nextLine());
				System.out.println("Nhập giá trị " + target + " thành công");
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai, hãy nhập giá trị số nguyên !!!");
			}
		} while(true);
		ip.close();
		
		return input;
	}
}
