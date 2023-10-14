package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04Exception_ThrowThrows {
	/*
	  Validation: Val trước đoạn code có khả năng bị exception
	  try catch: đưa đoạn code có khả năng bị exception vào khối try
	  
	  throw_throws:
	   +) throw: ném exception trước khi đoạn code có khả năng bị exception xảy ra
	           : ném khi mà exception xảy ra hay không phụ thuộc vào param truyền lúc gọi hàm
	   +) throws: Ném compile exception ở chỗ khai báo hàm để nơi gọi hàm này phải xử lý lỗi.
	   
	  Compile, runtime exception
	  trong hàm: Nếu mình throw new runtime exception thì tại chỗ khai báo hàm không bắt buộc
	  			 phải throw ra runtime exception
	  			 Và nếu có throws runtime exception thì nó vô nghĩa: Vì nó không bắt buộc phải xử lý trong compile
	  			 (Xử lý có hai cách: 1 xử lý tại chỗ or tiếp tục throw ra)
	  trong hàm: Nếu mình throw new compile exception thì tại chỗ khai báo hàm BẮT BUỘC phải 
	  			 throw ra compile exception
	  			 --> để chỗ gọi hàm biết được bên trong hàm có compile exception
	  			 	 bắt buộc phải xử lý
	  
	  Multiple exception
	  custom exception
	  try/catch try/finally try/catch/finally
	 */
	public static void main(String[] args) {
		System.out.println("Ex04 - Start");
		try {
			createFile("data1.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ex04 - End");
	}
	
	// path = [folder]../../fileName.txt(jpg, pdf, ...)
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		if(file.exists()) {
			System.out.println(">>> File " + file.getName() + " is available");
			return file;
		}
		boolean isSuccess = file.createNewFile();
		String message = isSuccess ? "Successful" : "failed";
		System.out.println("File " + file.getName() + " is create " + message);
		return file;
	}
}
