package bai01;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.Comparator.*;

import static utils.ArrayUtils.*;

public class App01 {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 3, 1};
		generate("1.Loại bỏ những phần tử trùng nhau", removeDuplicateData(array1));
		
		int result = compareAvg(array1);
		System.out.println("2.Giá trị trung bình của n/2 phần tử đầu"
							+ (result > 0 ? " lớn hơn " : (result < 0 ? " bé hơn " : " bằng với "))
							+ "giá trị trung bình của n/2 phần tử cuối");
		
		System.out.println();
		
		Integer[] array2 = {7, 8, 8, 8, 6, 2, 5, 1};
		System.out.println("3.Số lớn thứ 3 trong mảng là: " + getThirdLargest(array2));
	}
	private static int[] removeDuplicateData(int[] arr) {
		int[] temp = new int[arr.length];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean isExit = false;
			for(int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					isExit = true;
					break;
				}
			}
			if(!isExit) {
				temp[count] = arr[i];
				count++;
			}
		}
		
		return Arrays.copyOf(temp, count);
	}
	
	private static int compareAvg(int[] arr) {
		double avgFirst = 0;
		double avgLast = 0;
		double count = 0;
		for(int i = 0; i < arr.length/2; i++) {
			avgFirst += arr[i];
			count++;
		}
		avgFirst = avgFirst/count;
		
		// reset counter
		count = 0;
		for(int i = arr.length/2; i < arr.length; i++) {
			avgLast += arr[i];
			count++;
		}
		avgLast = avgLast/count;
		
		//System.out.println("avgFirst: " + avgFirst + " - avgLast: " + avgLast);
		return avgFirst > avgLast ? 1 : (avgFirst == avgLast ? 0 : -1);
	}
	
	private static int getThirdLargest(Integer[] arr) {
		int count = 0;
		int thridLargestNum;
		sort(arr);
		thridLargestNum = arr[0];
		count ++;
		for(int i = 1; i < arr.length; i++) {
			if(thridLargestNum > arr[i]) {
				thridLargestNum = arr[i];
				count++;
				if(count >= 3) {
					break;
				}
			}
		}
		
		return thridLargestNum;
	}
	
	private static void sort(Integer[] arr) {
		Arrays.sort(arr,
				nullsLast(comparing(Function.identity(), reverseOrder())));
	}
}
