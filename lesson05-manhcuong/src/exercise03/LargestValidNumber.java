package exercise03;

import java.util.Scanner;

public class LargestValidNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        
        int maxNumber = findLargestNumber(input);
        if (maxNumber != -1) {
            System.out.println("Số tự nhiên hợp lệ lớn nhất trong chuỗi là: " + maxNumber);
        }
        
        scanner.close();
    }

    public static int findLargestNumber(String input) {
        int maxNumber = -1;
        String currentNumber = "";

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber += ch;
            } else {
                if (!currentNumber.isEmpty()) {
                    int number = Integer.parseInt(currentNumber);
                    maxNumber = Math.max(maxNumber, number);
                    currentNumber = "";
                }
            }
        }

        if (!currentNumber.isEmpty()) {
            int number = Integer.parseInt(currentNumber);
            maxNumber = Math.max(maxNumber, number);
        }

        return maxNumber;
    }
}
