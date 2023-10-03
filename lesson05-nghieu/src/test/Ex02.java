package test;

public class Ex02 {

	public static void main(String[] args) {
		int a = 3;
		if(isSpecialNumber(a)==true) {
			System.out.println( a + " là số đặc biệt");
		}else {
			System.out.println( a + " không phải là số đặc biệt");
		}
	}
	
	private static boolean isSpecialNumber(int n) {
		for(int i = 0; i <= n; i++) {
			i += i;
			if(i == n) {
				return false;
			}
		}
		return true;
	}
}
