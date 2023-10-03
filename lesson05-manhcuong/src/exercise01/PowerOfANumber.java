package exercise01;

import java.util.Scanner;

public class PowerOfANumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        
        boolean isPower = isPowerOf(a, b);
        System.out.println(a + "," + b + ": " + isPower);
        
        scanner.close();
    }

    public static boolean isPowerOf(int a, int b) {
        if (a <= 0 || b <= 0) {
            return false;
        }

        int power = 1;
        while (power < a) {
            power *= b;
        }
        
        return power == a;
    }
}