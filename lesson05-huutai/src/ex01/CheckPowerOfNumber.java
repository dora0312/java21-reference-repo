package ex01;

public class CheckPowerOfNumber {
	public static void main(String[] args) {
		System.out.println(isPowerOf(3, 8));
	}

	private static boolean isPowerOf(int a, int b) {
		int max, min;
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		int i = 0;
		
		while (Math.pow(min, i) <= max) {
			if(Math.pow(min, i) == max) {
				return true;
			}
			
			i++;
		}
		
		return false;
	}
}
