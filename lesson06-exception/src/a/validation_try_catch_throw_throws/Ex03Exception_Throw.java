package a.validation_try_catch_throw_throws;

public class Ex03Exception_Throw {
	/*
	  Validation: Val trước đoạn code có khả năng bị exception
	  try catch: đưa đoạn code có khả năng bị exception vào khối try
	  
	  throw_throws:
	   +) throw: ném exception trước khi đoạn code có khả năng bị exception xảy ra
	           : ném khi mà exception xảy ra hay không phụ thuộc vào param truyền lúc gọi hàm
	 */
	
	public static void main(String[] args) {
		/*
		 Vị trí A: gọi hàm divide
		 		 : validate a, b nhập vào phải là số nguyên
		 		 :             b phải khác 0
		 */
		System.out.println("Vị trí A -->: " + divide(4, 2)); 
		/*
		 Vị trí B: gọi ham divide
		 		 : cho a, b tùy ý - chưa có validation
		 */
		try {
			System.out.println("Vị trí B: " + divide(4, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	private static int divide(int a, int b) {
		if (b == 0) {
			// fail first --> save time
			// custom exception, message
			throw new ArithmeticException("Lỗi bạn đang chia cho giá trị là 0");
		}
		return a / b;
	}
}
