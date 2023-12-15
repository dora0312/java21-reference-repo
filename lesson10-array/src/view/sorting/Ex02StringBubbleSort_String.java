package view.sorting;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import functional.Compare_String;

public class Ex02StringBubbleSort_String {
	public static void main(String[] args) {
		/*
		 Sorting with [non]-null values
		  + null first/last
		  + ascending/descending(non-null)
		 */
		
		String[] elements = {null, "a1", "bzt282", null, null, "k7", "12", "h5", "115", null, "d22", "76"};
		// Tăng dần: 
		// Giảm dần:
		String[] tempStr = Arrays.copyOf(elements, elements.length);
		generate("1. Elements", elements);
		
//		sortAsc(elements);
//		generate("2. Elements sorted", elements);
		
		generate("3. TempStr", elements);
		sort(elements, (s1, s2) -> {
			// process null elements(vd null first)
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			// process non-null elements
			return s1.compareTo(s2);
		});
		generate("3. elements sx tăng", elements);
		
		sort(tempStr, (s1, s2) -> {
			// process null elements(vd null last)
			if(s1 == null && s2 != null) {
				return 1;
			}
			if(s2 == null) {
				return -1;
			}
			// process non-null elements
			return s2.compareTo(s1);
		});
		generate("4. TempStr sx giảm", tempStr);
	}
	
	// String implements CharSequece, Comparable<String>, Serializable
	// Compareable<T> --> int compareTo(T t);   --> a.compareTo(b)
	// Object 		  --> boolean equals(Object 0); --> a.equals(b)
	
	private static void sort(String[] elements, Compare_String compare_String) {
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length - i -1; j++) {
				if(compare_String.compare(elements[j], elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
	
	
//	private static void sortAsc(String[] elements) {
//		for(int i = 0; i < elements.length; i++) {
//			for(int j = 0; j < elements.length - i -1; j++) {
//				if(elements[j].compareTo(elements[j + 1]) > 0) {
//					swap(elements, j, j + 1);
//				}
//			}
//		}
//	}
}
