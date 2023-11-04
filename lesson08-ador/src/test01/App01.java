package test01;

import java.util.Scanner;

public class App01 {
	private static final String VIETNAMESE_DIACRITIC_CHARACTERS = "ẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ";
	public static void main(String[] args) {
		//String yourString = inputYourSring();
		String yourString = "anh yêu em ";
		yourString = yourString.strip();
		System.out.println("**************** Các ký tự trên dòng ****************");
		for (int i = 0; i < yourString.length(); i++) {
			System.out.print("|" + yourString.charAt(i) + "|\n");
		}
		
		String[] words = yourString.strip().split("\\s+");
		
		System.out.println("**************** Mỗi từ trên dòng *************");
		for (String word:words) {
			System.out.println(word);
		}
		
		System.out.println("**************** Chuỗi đảo ngược ký tự *************");
//		for (int i = yourString.length() - 1; i >= 0; i--) {
//			System.out.print(yourString.charAt(i));
//		}
		System.out.println("|" + new StringBuffer(yourString).reverse().toString() + "|");
		
		String reverStce = "";
		System.out.println("**************** Chuỗi đảo ngược từ *************");
		for (int i = words.length - 1; i >= 0; i--) {
			reverStce += words[i] + " ";
		}
		reverStce = reverStce.strip();
		System.out.print("|" + reverStce + "|");
	
	}
	private static String inputYourSring() {
		Scanner ip = new Scanner(System.in);
		String yourString = "";
		do {
			System.out.print("Nhập chuỗi tiếng việt có chứa dấu và khoảng trống: ");
			yourString = ip.nextLine();
			if (isValid(yourString)) {
				break;
			}
			else System.out.println("!!! Hãy nhập chuỗi tiếng việt có chứa DẤU và KHOẢNG TRỐNG !!!");
		} while (true);
		
		ip.close();
		return yourString;
	}
	
	private static boolean isValid(String yourStr) {
		for(char c:VIETNAMESE_DIACRITIC_CHARACTERS.toCharArray()) {
			if(yourStr.contains(Character.toUpperCase(c)+"") || yourStr.contains(Character.toLowerCase(c)+"")) {
				if( yourStr.contains(" ")) {
					return true;
				}
			}
		}
		return false;
	}
}
