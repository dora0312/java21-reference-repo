package view.string.immutable;

public class Ex04StringLidb02 {
	public static void main(String[] args) {
		String s = "cheers from da nang";
		// Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không ?
		System.out.println("start with hello: " + s.startsWith("hello"));
		System.out.println("start with cheers: " + s.startsWith("cheers"));
		System.out.println("end with 'ng'? " + s.endsWith("ng"));
		
		System.out.println("**************************************");
		// Thay thế chuỗi
		System.out.println("'from' change to 'to': " + s.replace("from", "to"));
		
		System.out.println("**************************************");
		// Loại bỏ các khoảng trắng thừa của chuỗi s3
		String s3 = "cheers    from da nang";
		s3 = s3.strip().replaceAll("\\s+", " ");
		System.out.println("s3: " + s3);
		
		System.out.println("**************************************");
		// Tạo chuỗi con của chuỗi s bắt đầu từ vị trí 2
		String sub = s.substring(2);
		System.out.println("sub: " + sub);
		
		System.out.println("**************************************");
		// Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không ?
		System.out.println("string contains da: " + s.contains("da"));
	}
}
