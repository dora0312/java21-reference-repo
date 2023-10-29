package view.string.immutable;

public class Ex02StringCompare {
	public static void main(String[] args) {
		// So sánh lớn, bé --> compareTo, vì String implements Comparable<?>
		
		String s1 = "hello";
		String s2 = "z";
		String s3 = "hello";
		String s4 = new String("hello");
		System.out.println("s1 compareTo s2 " + s1.compareTo(s2));
		
		// So sánh bằng --> equals, từ class Object
		Ex02StringCompare o1 = new Ex02StringCompare();
		Ex02StringCompare o2 = new Ex02StringCompare();
		// equals của class Object so sánh == nên sẽ giống toán tử == (So sánh vùng nhớ Stack)
		System.out.println("o1 equals o2 " + o1.equals(o2));
		System.out.println("s1 equals s3 " + s1.equals(s3));
		// String#Equals:  so sánh giá trị của String ở heap
		System.out.println("s1 equals s4 " + s1.equals(s4));

	}
}
