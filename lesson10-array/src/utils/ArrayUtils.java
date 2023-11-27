package utils;

import java.util.Arrays;

public class ArrayUtils {
	private ArrayUtils() {
	}
	
	public static void generate(String prefix, int... elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}

	public static void copy(int[] origin, int[] target) {
		for (int i = 0; i < origin.length; i++) {
			target[i] = origin[i];
		}
	}
}
