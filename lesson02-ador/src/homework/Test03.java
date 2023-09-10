package homework;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yourInput = "";
		int inputData = 0;
		int resFactNum = 0;
		
		System.out.print("Nhập số nguyên dương cần tìm giai thừa : ");
		yourInput = sc.nextLine();
		if( yourInput.matches("\\d+") ) {
			inputData = Integer.parseInt(yourInput);
			resFactNum = factCalcFun(inputData);
			System.out.println("Kết quả của "+ inputData + "! = " + resFactNum);
		} else {
			System.out.println("Thêm yêu cầu(thêm tiền) check thêm input có phải là số nguyên dương không");
		}
		System.out.println("\n=========Finished System=========");
		sc.close();
	}
	private static int factCalcFun(int factNum) {
		int resFactNum = 1;
		for( int count = factNum; count > 0; count-- ) {
			resFactNum *= count;
		}
		return resFactNum;
	}
}
