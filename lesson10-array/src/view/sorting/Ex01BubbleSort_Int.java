package view.sorting;
import static utils.ArrayUtils.*;

import functional.Compare_Int;
public class Ex01BubbleSort_Int {
	public static void main(String[] args) {
		int[] elements = {1, 5, 11, 9, 4, 6};
		generate("1. Elements", elements);
		
		int[] temp1 = elements;
		int[] temp2  = elements;
		generate("1. temp1", elements);
		sortAsc(temp1);
		generate("2. Elements(sort ascending)", temp1);
		
		sort(temp2, (e1, e2) -> e1 > e2 );
		generate("2. Elements(sort ascending)", temp2);
		
		sortDes(temp1);
		generate("3. Elements(sort Descending)", temp1);
		
		sort(temp2, (e1, e2) -> e1 < e2 );
		generate("3. Elements(sort Descending)", temp2);
	}
	
	// elements[col] > elements[col + 1]  --> boolean
	// elements[col] < elements[col + 1]  --> boolean
	// boolean test(int e1, e2)
	
	private static void sort(int[] elements, Compare_Int compareInt) {
		// sort ascending | descending
		for(int row = 0; row < elements.length; row++) {
			for(int col = 0; col < elements.length - row - 1; col++) {
				// Nếu test(a[j], a[j+1]) return true
				// --> Hoán vị phần tử j và j + 1 
				if(compareInt.test(elements[col], elements[col + 1])) {
					swap(elements, col, col + 1);
				}
			}
		}
	}
	
	
	private static void sortAsc(int[] elements) {
		// sort ascending | descending
		for(int row = 0; row < elements.length; row++) {
			for(int col = 0; col < elements.length - row - 1; col++) {
				if(elements[col] > elements[col + 1]) {
					swap(elements, col, col + 1);
				}
			}
		}
	}
	private static void sortDes(int[] elements) {
		// sort ascending | descending
		for(int row = 0; row < elements.length; row++) {
			for(int col = 0; col < elements.length - row - 1; col++) {
				if(elements[col] < elements[col + 1]) {
					swap(elements, col, col + 1);
				}
			}
		}
	}
	
}
