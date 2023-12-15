package view.sorting.available.method;

import java.util.Arrays;

import common.SortType;

import static utils.ArrayUtils.*;

public class Ex01QuickSort_Int {
	
	public static void main(String[] args) {
		
		// list, set, map --> sort
		// array --> sort
		
		int[] elements = { 1, 5, 11, 9, 4, 6 };
		
		Arrays.sort(elements);
		
		// no support for descending with primitive type
		generate("1. Sort items(default asc)", elements);
		
		sort(elements, SortType.DESC);
		
		generate("2. Sort items(desc)", elements);
	}
}