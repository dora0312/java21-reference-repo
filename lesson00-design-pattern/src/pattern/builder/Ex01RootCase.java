package pattern.builder;

import java.math.BigDecimal;

public class Ex01RootCase {
	public static void main(String[] args) {
		/*
		 Khái niệm:
		   Design pattern: Là các mẫu code(mẫu thiết kế) được tạo/sinh ra từ kinh nghiệm của người đi trước.
		   				   -->Giúp mình giải quyết các vấn đề cụ thể.
		   				   Cung cấp một giải pháp linh hoạt, tạo ra các đối tượng OOP
		   				   Mục đích: Để phân chia ra construction các đối tượng class tiện hơn
		   				   			 
		 
		 
		 Đặt vấn đề:
		 	+ Được dùng để tạo ra các đối tượng cho các complex class/object
		 	Complex class/object là class có nhiều(>=6) thuộc tính và có rất nhiều mixing constructor từ class này.
		 		mixing: lúc thì là class này class kia
		 		vd: A: a1, a2, a3, a4, a5
		 			+ constructor()
		 			+ constructor(a1, a2, a3)
		 			+ constructor(a2, a3, a4, a5)
		 			+ ....
		 			
		 			-> code rườm rà
		 			--> Vì constructor luôn trùng tên với class
		 				Ví dụ: cần constructor 1 tham số a1, a2 và cần constructor a5, a6
		 				--> nếu như a1, trung KDL với a5
		 	+ Cách thực thi:
		 	  Thay vì dùng setter --> 1 lần gọi hàm set giá trị xong trả về void, lấy đối tượng đó gọi lại --> code dài
		 	  Dùng builder style --> 1 lần gọi hàm set giá trị xong trả về chính đối tượng hiện tại --> tiếp tục đi gọi các hàm khác.
		 	  			ví dụ:
		 	  					LocalDateTime.now()  // LocalDateTime
									.withHour(15)    // LocalDateTime
									.withMinute(20)  // LocalDateTime
									.withSecond(30); // LocalDateTime
		 	  			
		 (builder pattern --> google search)
		 */
		
		User user1 = User.builder()   // Builder(H1)
				.withId(15)           // Builder
				.withFirstName("Teo") // Builder
				.withLastName("Le")   // Builder
				.build();			  // User
		
		User user2 = User.builder()      // Builder(H2)
				.withId(18)                // Builder
				.withEmail("na@gmail.com") // Builder
				.build();
		
		User user3 = User.builder()      // Builder(H2)
				.withId(22)                // Builder
				.withAddress("sw")         // Builder
				.withEmail("na@gmail.com") // Builder
				.build();
		
		System.out.println("user1 --> " + user1);
		System.out.println("user2 --> " + user2);
		System.out.println("user3 --> " + user3);
		
		BigDecimal a = new BigDecimal(12)
						.add(db(22))
						.add(db(35));
		System.out.println("a --> " + a);
		
		User2 uA = new User2()
				.withId(15)
				.withAddress("Da Nang");
		User2 uB = User2.of()
				.withId(16)
				.withAddress("Kon Tum");
		System.out.println("uA : " + uA);
		System.out.println("uB : " + uB);
	
	}
	private static BigDecimal db(double doubleValue) {
		return BigDecimal.valueOf(doubleValue);
	}
}
