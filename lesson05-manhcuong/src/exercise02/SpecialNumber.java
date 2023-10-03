package exercise02;

import java.util.Scanner;

public class SpecialNumber {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Nhập số nguyên dương a : ");
	        int number = scanner.nextInt();
	        
	        if (isSpecialNumber(number)) {
	            System.out.println(number + " là số đặc biệt.");
	        } else {
	            System.out.println(number + " không phải là số đặc biệt.");
	        }
	        
	        scanner.close();
	    }

	    public static boolean isSpecialNumber(int number) {
	        int sum = 0;
	        for (int i = 1; i <= number; i++) {
	            sum += i;
	            if (sum == number) {
	                return true;
	            }
	        }
	        return false;
	    }

  }
