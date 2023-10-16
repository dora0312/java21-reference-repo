package test04;

public class ReadNumber {
	private static final String[] hangDonVi = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
	private static final String[] hangChuc = {"", "mốt", "hai", "ba", "bốn", "lăm", "sáu", "bảy", "tám", "chín"};
	private static final String[] hangChuc2 = {"", "một", "hai", "ba", "bốn", "lăm", "sáu", "bảy", "tám", "chín"};
	public static void main(String[] args) {
		int numToRead = 2;
		int [] arr = {1,9,10,11,15,19,20,21,99,100,101,109,110,115,500,550,901,909,999};
		for (int i = 0; i < arr.length; i++) {
			String readNum = "";
			numToRead = arr[i];
			readNum = readTram(numToRead) + readChuc(numToRead) + readDonVi(numToRead);
			readNum = readNum.substring(0,1).toUpperCase() + readNum.substring(1);
			System.out.println("Số " + arr[i] + " đọc là : " + readNum);
		}
		
	}
	
	private static String readTram(int num) {
		String read = "";
		if ( num >= 100 ) {
			read = hangDonVi[num/100] + " trăm ";
			if (1 <= num%100 && num %100 <= 9) {
				read += "lẻ ";
			}
		}
		return read;
	}
	private static String readChuc(int num) {
		String read = "";
		int tempNum = num % 100;
		
		if (tempNum >= 10) {
			num = num / 10;
			if(tempNum >= 20) {
				read = hangDonVi[num % 10] + " mươi ";
			} else if ( tempNum >= 10) {
				read = "mười ";
			}
		}
		return read;
	}
	
	private static String readDonVi(int num) {
		String read = "";
		int tempNum = num % 100;
		if (tempNum >= 20) {
			read = hangChuc[num % 10];
		} else if( tempNum > 10) {
			read = hangChuc2[num % 10];
		} else if( 1 <= tempNum && tempNum <= 9) {
			read = hangDonVi[num % 10];
		}
		return read;
	}
}
