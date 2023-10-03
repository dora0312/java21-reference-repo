package bai03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		int[] arrays = {2, 3, 4, 6, 9, 8};
		int maxValue;
		
		maxValue = findMax(arrays);
		System.out.println(Arrays.toString(arrays));
		System.out.println("Bội nhỏ nhất là: " + getLeastCommonMultiple(arrays, maxValue));
		
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
	private static int getLeastCommonMultiple(int[] arrays, int max) {
		int numLeast = max;
		boolean findNum = false;
		while(!findNum) {
			findNum = true;
			for (int index = 0; index < arrays.length; index++) {
				if((numLeast % arrays[index]) != 0) {
					findNum = false;
					numLeast++;
					break;
				}
			}
		}
		return numLeast;
	}
}
