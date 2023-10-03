package ex02;

public class FindNumber {
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 4};
		
		System.out.println(getMissingNumber(arr));
	}
	
	private static int getMissingNumber(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
			
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[0] != 1) {
				return 1;
			}
			
			if(arr[i] + 1 != arr[i + 1]) {
				return arr[i] + 1;
			}
		}
		return arr[arr.length - 1] + 1;
	}
}
