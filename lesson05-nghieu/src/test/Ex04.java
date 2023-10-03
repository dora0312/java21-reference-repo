package test;

public class Ex04 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 8, 9, 2, 5, 9 };
		System.out.println(sum(a));
	}
	
	private static int sum(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			if( number != number) {
				sum += number;
			}
		}
		return sum;
	}
}
