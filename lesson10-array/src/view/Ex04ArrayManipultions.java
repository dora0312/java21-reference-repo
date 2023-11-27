package view;

import static utils.ArrayUtils.*;

import functional.Operator;
public class Ex04ArrayManipultions {
	public static void main(String[] args) {
		/**
		 * Cho mảng n phần tử số nguyên dương [1, 20]
		 * 
		 * Yêu cầu
		 * 1. Tìm tổng các phần tử trong mảng
		 * 2. Tìm hiệu các phần tử trong mảng
		 * 3. Tìm số lớn nhất của các phần tử trong mảng
		 * 4. Tìm số bé nhất của các phần tử trong mảng
		 * 5. Tìm giá trị trung bình của các phần tử trong mảng ***
		 */
		
		int[] numbers = {5, 22, 8, 18, 4};
		
		// sum(int...numbers) --> numbers: nhận vào 0 | 1 | n phần tử int hoặc mảng int[]
		// sum(int[] numbers) --> numbers: nhận vào mảng int[]
		
		generate("1. Tìm tổng các phần tử trong mảng", sum(numbers));
		generate("1. Tìm tổng các phần tử trong mảng", reduce(0, (a, b) -> a + b, numbers));
		
		generate("2. Tìm hiệu các phần tử trong mảng", sub(numbers));
		generate("2. Tìm hiệu các phần tử trong mảng", reduce(0, (a, b) -> a - b, numbers));
		
		generate("3. Tìm số lớn nhất của các phần tử trong mảng", max(numbers));
		generate("3. Tìm số lớn nhất của các phần tử trong mảng", 
				reduce(
					Integer.MIN_VALUE,
					(a, b) -> a < b ? b : a, 
					numbers
				)
		);
		
		generate("4. Tìm số bé nhất của các phần tử trong mảng", min(numbers));
		generate("4. Tìm số lớn nhất của các phần tử trong mảng", 
				reduce(
					Integer.MAX_VALUE,
					(a, b) -> a > b ? b : a, 
					numbers
				)
		);
		
	}
	
	// result + number;
	// result - number
	// result < number ? number : result;
	// result > number ? number : result;
	
	// Biểu thức: int operate(int a, int b)
	
	// (a, b) -> a + b;
	// (a, b) -> a - b;
	// (a, b) --> a < b ? b : a
	// (a, b) --> a > b ? b : a
	// {5, 2, 8, 18, 4};
	private static int reduce(int initial, Operator operator, int... numbers) {
		int result = initial;
		for (int number: numbers) {
			result = operator.operator(result, number);
		}
		return result;
	}
	
	private static int sum(int... numbers) {
		int result = 0;
		for (int number: numbers) {
			result = result + number;
		}
		return result;
	}
	
	private static int sub(int...numbers) {
		int result = 0;
		for (int number: numbers) {
			result = result - number;
		}
		return result;
	}
	
	private static int max(int...numbers) {
		int result = Integer.MIN_VALUE;
		for (int number: numbers) {
			result = result < number ? number : result;
		}
		return result;
	}
	
	private static int min(int...numbers) {
		int result = Integer.MAX_VALUE;
		for (int number: numbers) {
			result = result > number ? number : result;
		}
		return result;
	}
}