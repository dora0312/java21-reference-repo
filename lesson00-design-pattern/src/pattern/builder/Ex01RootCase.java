package pattern.builder;

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
		 				
		 (builder pattern --> google search)
		 */
	}
}
