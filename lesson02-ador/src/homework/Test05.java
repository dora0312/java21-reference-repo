package homework;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yourInput = "";
	    int inputNum = 0;
	    boolean isDoiXungNum = false;
	    
	    do {
			System.out.print("Nhập dãy số cần kiểm tra số đối xứng: ");
			yourInput = sc.nextLine();
			if(!yourInput.matches("\\d+")) {
				System.out.println("\n==>>Bạn nhập sai ! Hãy nhập dãy số NGUYÊN DƯƠNG<<==");
			}
			if(yourInput.matches("\\d+") && yourInput.length() < 2) {
				System.out.println("\n==>>Bạn nhập sai ! Hãy nhập lại số đối xứng tối thiểu 2 chữ số<<==");
			}
		} while(!yourInput.matches("\\d+") || yourInput.length() < 2);
	    
	    inputNum = Integer.parseInt(yourInput);
	    isDoiXungNum = isDoiXungNumFunc(inputNum);
	    
	    System.out.println("Có phải là số đối xứng không ? --> " + (isDoiXungNum == true? "Đúng":"Không"));
	    sc.close();
	}
	public static boolean isDoiXungNumFunc(int inputNum) {
		int reversed = 0, original;
		original = inputNum;
	    while(inputNum != 0) {
	      int digit = inputNum % 10;
	      reversed = reversed * 10 + digit;
	      inputNum /= 10;
	    }
	    if( reversed == original ) {
	    	return true;
	    }
	    return false;
	}
}
