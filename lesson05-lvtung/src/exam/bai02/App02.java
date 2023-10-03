package exam.bai02;

public class App02 {

	public static void main(String[] args) {
		int n = 6;
		if (isSpecialNumber(n)) {
			System.out.println(n + " là số đặc biệt !");
		} else {
			System.out.println(n + " không phải là số đặc biệt !");
		}
	}

	private static boolean isSpecialNumber(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (sum == n) {
				return true;
			}
			if (sum > n) {
				return false;
			}
		}
		return false;
	}
}
