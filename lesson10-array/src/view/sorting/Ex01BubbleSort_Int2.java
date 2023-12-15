package view.sorting;
import static utils.ArrayUtils.*;

//import functional.Compare_Int;
import functional.Compare_Int2;
public class Ex01BubbleSort_Int2 {
	public static void main(String[] args) {
		int[] elements = {1, 5, 11, 9, 4, 6};
		generate("1. Elements", elements);
		
//		int[] temp1 = elements;
		int[] temp2  = elements;
		generate("1. temp2", temp2);
//		sortAsc(temp1);
//		generate("2. Elements(sort ascending)", temp1);
//		
		// Nếu e1 > e2 thì swap
		sort(elements, (e1, e2) -> e1 - e2 );
		/* tương đương
		  if(e1 > e2) {
		    return 1;
		  }
		  return -1;
		 */
		generate("2. Elements(sort ascending)", elements);
		
//		sortDes(temp1);
//		generate("3. Elements(sort Descending)", temp1);
		
		// Nếu e1 < e2 thì swap
		sort(temp2, (e1, e2) -> e2 - e1 );
		/* tương đương
		  if(e1 < e2) {
		    return 1;
		  }
		  return -1;
		 */
		generate("3. Elements(sort Descending)", temp2);
	}
	
	// elements[col] > elements[col + 1]  --> boolean
	// elements[col] < elements[col + 1]  --> boolean
	// boolean test(int e1, e2)
	
	private static void sort(int[] elements, Compare_Int2 compareInt) {
		// sort ascending | descending
		for(int row = 0; row < elements.length; row++) {
			for(int col = 0; col < elements.length - row - 1; col++) {
				// Nếu compare(a[j], a[j+1]) return số dương
				// --> Hoán vị phần tử j và j + 1 
				if(compareInt.compare(elements[col], elements[col + 1]) > 0) {
					swap(elements, col, col + 1);
				}
			}
		}
	}
	
	
//	private static void sortAsc(int[] elements) {
//		// sort ascending | descending
//		for(int row = 0; row < elements.length; row++) {
//			for(int col = 0; col < elements.length - row - 1; col++) {
//				if(elements[col] - elements[col + 1] > 0) {
//					swap(elements, col, col + 1);
//				}
//			}
//		}
//	}
//	private static void sortDes(int[] elements) {
//		// sort ascending | descending
//		for(int row = 0; row < elements.length; row++) {
//			for(int col = 0; col < elements.length - row - 1; col++) {
//				if(elements[col] - elements[col + 1] < 0) {
//					swap(elements, col, col + 1);
//				}
//			}
//		}
//	}
	
}
