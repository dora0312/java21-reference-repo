package homework.test;

public class test03 {
	public static void main(String[] args) {
        int n = 4; // Số hàng của tam giác Pascal
        printPascalTriangle(n);
    }

    public static void printPascalTriangle(int n) {
        for (int i = 1; i <= n + 1; i++) {
            int value = 1; // Phần tử đầu tiên của mỗi hàng luôn là 1
            for (int j = 0; j <= i; j++) {
            	
            	if(value < 10) {
					System.out.print(value + "   ");
				} else {
					System.out.print(value + "  ");
				}
                value = (value * (i - j)) / (j + 1);
                
            }
            System.out.println(); 
        }
    }
}
