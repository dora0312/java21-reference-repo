package ex04;

public class Ex04 {

	public static void main(String[] args) {
		int[] a = {1, 5, 8, 9, 2, 5, 9};
		for (int i = 0; i < a.length; i++) {
			if (findNumberTheSame(a, a[i]) == 1)
				System.out.println( a[i]);
		}
	}
	
	private static int findNumberTheSame(int[] a, int i) {
		int count = 0;
		for (int j = 0; j < 7; j++) {
			if (a[j] == i)
				count++;
		}
		return count;
	}
	}



