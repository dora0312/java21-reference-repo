package test;

public class Ex01 {

	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		if(isPowerOf(a,b)==true) {
			System.out.println("là lũy thừa");
		}else System.out.println("không phải lũy thừa");
	}
	
	private static boolean isPowerOf(int a, int b) {
		boolean retun = false;
		if(a < b) {
			int x = a;
			a = b;
			b = x;
		}
		if(a == 0) {
			return retun;
		}else {
			while(a != 1) { 
				if(a % b != 0){ 
					return retun;
				}else {
					a = a / b;   
				}
			}
			retun = true;
		}
		return retun;
	}
}
