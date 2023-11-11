package test02;

public class App02 {
	public static void main(String[] args) {
		String yourInput = "aa6b546c6e22h, aa6b326c6e22h";
		String[] findNum = yourInput.strip().split(", ");
		getLargestNumber(findNum);
		
	}
	private static void getLargestNumber(String[] yourString) {
		long[] arr = new long[20];
		System.out.println("Kết quả: ");
		for(String str:yourString) {
			arr = getNumInArr(str);
			System.out.print(largestNum(arr) + ", ");
		}
	}
	private static long[] getNumInArr(String st) {
		long[] arr = new long[st.length()];
		String toNum = "0";
		int index = 0;
		for(int i = 0; i < st.length(); i++) {
			String ch = st.charAt(i) + "";
			try {
				toNum += Long.parseLong(ch) + "";
			}catch (NumberFormatException e) {
				arr[index] = Long.parseLong(toNum);
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
