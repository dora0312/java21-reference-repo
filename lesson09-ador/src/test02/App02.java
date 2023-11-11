package test02;

import java.util.Arrays;
import java.util.Scanner;

public class App02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int index = 0;
		index = inputIndex(ip);
//		String yourInput = "aa6b546c6e22h, aa6b326c6e22h";
		String yourInput = inputString(ip, index);
		String[] findNum = yourInput.strip().split(", ");
		getLargestNumber(findNum, index);
		ip.close();
	}
	private static String inputString(Scanner ip, int index) {
		String str = "";
		for(int i = 0; i < index; i++) {
			System.out.print("Nhập chuỗi số " + (i + 1) + " : ");
			str += ip.nextLine() + (i < index - 1? ", " : "");
		}
		return str;
	}
	private static int inputIndex(Scanner ip) {
		int index = 0;
		do {
			try {
				System.out.print("Nhập số lượng chuỗi: ");
				index = Integer.parseInt(ip.nextLine());
				if(index < 1) {
					throw new NumberFormatException();
				}
				break;
			}catch (NumberFormatException e) {
				System.out.println("!!! Vui lòng nhập số nguyên dương >= 1!!!");
			}
		} while(true);
		return index;
	}
	private static void getLargestNumber(String[] yourString,  int index) {
		long[] result = new long[index];
		int indexLocal = 0;
		System.out.print("Kết quả: ");
		for(String str:yourString) {
			long[] arr = new long[str.length()];
			arr = getNumInArr(str);
			result[indexLocal] = largestNum(arr);
			indexLocal++;
		}
		Arrays.sort(result);
		for(int i = 0; i < index; i++) {
			System.out.print(result[i] + (i < index - 1? ", " :""));
		}
	}
	private static long[] getNumInArr(String st) {
		long[] arr = new long[st.length()];
		String toNum = "0";
		int index = 0;
		long temp = 0;
		for(int i = 0; i < st.length(); i++) {
			String ch = st.charAt(i) + "";
			try {
				temp = Long.parseLong(ch);
				toNum += temp + "";
			}catch (NumberFormatException e) {
				arr[index] = Long.parseLong(toNum);
				toNum = "0";
				index++;
			}
		}
		return arr;
	}
	private static long largestNum(long[] arr) {
		long max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }
        return max;
	}
	
}
