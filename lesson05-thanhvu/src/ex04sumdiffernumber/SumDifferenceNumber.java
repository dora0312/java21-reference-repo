package ex04sumdiffernumber;

public class SumDifferenceNumber {

	public static int sum(int[] arr) {
		int S = 0;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[k] == arr[i]) {
				
			}
			}
		return S;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 9, 2, 5, 9};
		System.out.println("Sum difference number --> " + sum(arr));
	}
}
