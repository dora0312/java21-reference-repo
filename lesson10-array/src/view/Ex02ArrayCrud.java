package view;

import java.util.Arrays;

import static utils.ArrayUtils.*;
public class Ex02ArrayCrud {
	public static void main(String[] args) {
		int[] number = {2, 9, 3, 17, 7};
		generate("Array old", number);
		int[] addNumber = addNumber(number, 2, 88);
		generate("Array after add", addNumber);
		int[] removeNumber = removeNumber(number, 3);
		generate("Array remove after", removeNumber);
	}
	private static int[] addNumber(int[] elements, int pos, int value) {
		if (pos < 0 || pos >= elements.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return elements;
		}
		
		int[] target = new int[elements.length+1];
		
		copy(elements, target);
		
		for (int i = target.length-1; i > pos; i--) {
			target[i] = target[i-1];
		}
		
		target[pos] = value;
		
		return target;
	}
	
	private static void readNumber() {
		
	}
	private static void updateNumber() {
		
	}
	private static int[] removeNumber(int[] elements, int pos) {
		if (pos < 0 || pos >= elements.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return elements;
		}
		int[] target = new int[elements.length];
		
		System.arraycopy(elements, 0, target, 0, elements.length);
		
		for (int i = pos; i < target.length - 1; i++) {
			target[i] = target[i+1];
		}
		
		return Arrays.copyOfRange(target, 0,  target.length - 1);
	}
}
