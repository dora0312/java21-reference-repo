package ex02;

public class Ex02 {

	public static void main(String[] args) {
		int a = 6;
		if (isSpecialNumber(a)) {
            System.out.println(a + " là số đặc biệt.");
        } else {
            System.out.println(a + " không là số đặc biệt.");
        }
	}
	
	private static boolean isSpecialNumber(int a) {
		int sum = 0;
		
		for(int i = 1; i <= a; i++  ) {
			sum +=i;
		}
		return sum == a;
	}
	
}
