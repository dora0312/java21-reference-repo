package ex02.special;

import java.util.Scanner;

public class Ex02Special {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập số số đặc biệt cần kiểm tra: ");
		Integer n = sc.nextInt();
		int s=0;
			for(int i = 1;;i++) {
				s+=i;
				if(s==n) {
				System.out.println("n là số đặc biệt");
				return;
				} else if(s>n) {
					System.out.println("n không phải là số đặc biệt");
					return;}
				}
				
	}
	}

