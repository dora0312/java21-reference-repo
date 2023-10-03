package bai02;

public class Bai02 {
	public static void main(String[] args) {
		int[] arrays = {1, 2, 4, 5, 6, 7, 8, 10, 3};
		System.out.println("Số còn thiếu là: "+ getMissingNumber(arrays, findMax(arrays)));
	}
	
	private static int getMissingNumber(int[] arrays, int max) {
		int sumFind = (max * (max + 1))/2;
		int sum = 0;
		for(int index : arrays) {
			sum += index;
		}
		return sumFind - sum;
	}
	private static int findMax(int[] arrays) {
		int max = arrays[0];
		for(int index = 0; index < arrays.length; index++) {
			if(max < arrays[index]) {
				max = arrays[index];
			}
		}
		return max;
	}
}
