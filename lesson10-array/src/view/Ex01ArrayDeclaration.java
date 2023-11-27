package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {
	public static void main(String[] args) {
		// Mảng chứa các phần tử là KDL nguyên thủy, KDL đối tượng
		
		// Khai báo mảng 1 chiều
		int[] digits = new int[3];
		int[] numbers = new int[] {1, 2, 3, 5, 8};
		int[] elements = {1, 2, 3, 5, 8};
		// --> digits là KDL đối tượng
		// --> digits thuộc class là [I (digits.getClass())
		
		System.out.println("digits --> " + digits.getClass());
		System.out.println("numbers --> " + numbers.getClass());
		System.out.println("elements --> " + elements.getClass().getSimpleName());
		
		String[] words = {"hello", "xin chào", "wellcome"};
		System.out.println("words1 --> " + words.getClass().getSimpleName());
		System.out.println("words2 --> " + Arrays.toString(words));
		modify(words);
		System.out.println("words3 --> " + Arrays.toString(words));
		/* Khai báo mảng 2, n chiều 
		    --> 100% tối đa sử dụng mạng 2 chiều
		        n chiều hạn chế sử dụng
		   
		   Mảng 1 chiều: mỗi phẩn tử là 1 giá trị đơn (nguyên thủy, đối tượng)
		   Mảng 2 chiều: mối phần tử là 1 mảng 1 chiều
		   		Ví dụ: ma trận(rows, colums) --> 3row*4colums
		*/
		int[][] empty = new int[3][4];
		int[][] matrix = {
				{1, 2, 3, 4},
				{2, 6, 2, 3},
				{4, 7, 7, 1}
		};
		
		System.out.println("--------------------------------------");
		System.out.println("matix[1] -->" + Arrays.toString(matrix[1]));
		for(int rI = 0; rI < matrix.length; rI++) {
			for(int colI = 0; colI < matrix[rI].length; colI++) {
				System.out.print(matrix[rI][colI] + " ");
			}
			System.out.println();
		}
		
		
		 /*
		  Mảng 3 chiều: mỗi phần tử là 1 mảng 2 chiều
		   -->Nếu cần lưu trữ từ 3 chiều trở lên --> chuyển sang dùng mảng đối tượng một chiều
		   KDL: Type: x, y, z
		   		Type[] type = {new Type(1,2,3), new Type(2,3,4)};
		   
		  Mảng n chiều: mỗi phần tử là 1 mảng n-1 chiều
		   -->
		*/
		int[][][] miltiA = new int[5][5][5];
		int[][][] b = {
				{{},{}},
				{{},{}},
		};
	}
	
	private static void modify(String[] elements) {
		elements[1] = null;
	}
	
	private static int[] getNumbrs() {
		return new int[]{1, 2, 3, 5};
	}
	private static int[] getElements() {
		
		return new int[] {3,4,5,2};
	}
}
