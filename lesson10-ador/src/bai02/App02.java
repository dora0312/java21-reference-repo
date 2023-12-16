package bai02;

import static model.DataModel.*;
import static utils.ArrayUtils.*;

public class App02 {
	public static void main(String[] args) {
		int[][] matrix = mockData();
		generate("0.Nguyên bản", matrix);
		System.out.println("============================");
		
		replaceMatrix(matrix);
		generate("1.Sau khi chuyển đổi", matrix);
	}
	private static void replaceMatrix(int[][] matrix) {
		int[][] tempMatrix = new int[matrix.length][matrix[0].length];
		// copy origin array
		copy(matrix, tempMatrix);
		
		// find array value = 0 at i,j
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					replaceData(tempMatrix, i, j);
				}
			}
		}
		
		// copy replaced array to origin
		copy(tempMatrix, matrix);
	}
	
	private static void replaceData(int[][] tempMatrix, int line, int row) {
		// replace line
		for(int j = 0; j < tempMatrix[line].length; j++) {
			tempMatrix[line][j] = 0;
		}
		// replace row
		for(int i = 0; i < tempMatrix.length; i++) {
			tempMatrix[i][row] = 0;
		}
	}
}
