package view.string.immutable;

public class Ex03StringLib01 {
	public static void main(String[] args) {
		String s = "welcome to class";
		// len = length
		// nối chuỗi --> concat, +,
		// lấy ký tự tại vị trí --> chartAt(pos)
		char letter = s.charAt(3);
		
		// Duyệt từng kí tự trong chuỗi
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
		// Duyệt từng từ trong chuỗi, các từ cách nhau bởi space
		s = "welcome    to   class";
			// --> thủ công check từng chuỗi có space thì tách ra
			System.out.println("===========replaceAll");
			String word = "";
			s = s.replaceAll("\\s+", " ");
			for (int i = 0; i < s.length(); i++) {
				char temp = s.charAt(i);
				if (temp == ' ') {
					System.out.println("word: " + word);
					word = "";
				} else {
					word += String.valueOf(temp);
					// or word += "" + temp;
					if (i == s.length() - 1) {
						System.out.println("word: " + word);
					}
				}
			}
			// --> Dùng function thì --> split();
			System.out.println("=============split()============");
			s = "  welcome    to   class   ";
			String[] tooken = s.strip().split("\\s+");
			for (String tk: tooken) {
				System.out.println("|"+tk+"|");
			}
		// Tìm vị trí - chỉ số xuất hiện đầu tiên, cuối cùng của kí tự 'c' trong chuỗi s
		s = "welcome    to   class   ";
		// bắt đầu = 3, cuối = 16
		System.out.println("Vị trí đầu của c: " + s.indexOf("c"));
		System.out.println("Vị trí đầu của c: " + s.lastIndexOf("c"));
		
	}
}
