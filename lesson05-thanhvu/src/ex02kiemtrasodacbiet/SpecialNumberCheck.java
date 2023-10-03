package ex02kiemtrasodacbiet;

public class SpecialNumberCheck {

	public static boolean isSpecialNumber(int number) {
		int S = 0;
		if (number == 1) {
			return true;
		}
		for (int i = 1; i < number; i++) {
			S += i;
			if (S == number) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("isSpecialNumber --> " + isSpecialNumber(1));
		System.out.println("isSpecialNumber --> " + isSpecialNumber(3));
		System.out.println("isSpecialNumber --> " + isSpecialNumber(6));
		System.out.println("isSpecialNumber --> " + isSpecialNumber(10));
		System.out.println("isSpecialNumber --> " + isSpecialNumber(2));
	}
}
