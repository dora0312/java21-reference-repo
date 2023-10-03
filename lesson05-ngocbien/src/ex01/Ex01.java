package ex01;

public class Ex01 {

	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		System.out.println(isPowerOf(a, b));
	}
	
	private static boolean isPowerOf(int a, int b) {
		
		
		if (a > b) {
			double x = Math.log(a) / Math.log(b);
			return Math.ceil(x) == Math.floor(x);
		}else {
			double y = Math.log(b) / Math.log(a);
			return Math.ceil(y) == Math.floor(y);
		}
	}
}
