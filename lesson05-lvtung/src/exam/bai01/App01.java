package exam.bai01;

public class App01 {

	public static void main(String[] args) {
		int numCheck = 8;
		int base = 2;
		if(isPowerOf(numCheck, base)) {	
			System.out.println(numCheck + " là lũy thừa của " + base);
		} else {
			System.out.println(numCheck + " không là lũy thừa của " + base);
		}
		
	}
	
	private static boolean isPowerOf(int numCheck, int base) {
		if (numCheck < 1) {
			System.out.println("Số cần kiểm tra có phải là lũy thừa không phải lớn hơn 1 !");
		} 
		while(numCheck > 1) {
			if (numCheck % base != 0) {
				return false;
			}
			numCheck /= base;
		}
		return true;
	}
}	
