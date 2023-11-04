package test01;

import java.util.Scanner;

public class App01 {
	private static final String VIETNAMESE_DIACRITIC_CHARACTERS = "ẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ";
	public static void main(String[] args) {
		String yourString = inputYourSring();
//		String yourString = "anh yêu em ";
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
		System.out.println("*** Nhập chuỗi tiếng việt có chứa dấu và khoảng trống ***");
		System.out.print("Mời nhập chuỗi: ");
		do {
			yourString = ip.nextLine();
			try {
				isValid(yourString);
				break;
			} catch (TestValidException e) {
				System.out.println(e.getMessage());
				System.out.print("\nMời nhập lại chuỗi: ");
			}
			
			
		} while (true);
		
		ip.close();
		return yourString;
	}
	
	private static void isValid(String yourStr) throws TestValidException {
		boolean status = false;
		for(char c:VIETNAMESE_DIACRITIC_CHARACTERS.toCharArray()) {
			if(yourStr.contains(Character.toUpperCase(c)+"") || yourStr.contains(Character.toLowerCase(c)+"")) {
				status = true;
			}
		}
		if(!status) {
			throw new TestValidException("!!! Hãy nhập chuỗi tiếng việt có DẤU !!!");
		}
		if(!yourStr.contains(" ")) {
			throw new TestValidException("!!! Hãy nhập chuỗi có ít nhất 1 KHOẢNG TRỐNG !!!");
		}
	}
}
