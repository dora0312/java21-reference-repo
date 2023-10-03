package ex01kiemtraluythua;

public class PowerCheck {

	public static boolean isPowerOf(int number, int base) {
        
		if (number == 1) {
            return true;
        }

        int power = 1;
        if (number > base) {
        	while (power < number) {
                power *= base;
        	}    
        } else {
        	while (power < base) {
                power *= number;
        	}
        }

        return power == number || power == base;
	}
	
	public static void main(String[] args) {
		System.out.println("isPower --> " + isPowerOf(4, 64));
		System.out.println("isPower --> " + isPowerOf(20, 4));
	}
}
