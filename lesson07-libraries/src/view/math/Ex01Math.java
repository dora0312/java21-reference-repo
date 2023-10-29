package view.math;
import static utils.NumberUtils.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
public class Ex01Math {
	// Phân trang: Paging - Pagination
	// Click vào Menu --> Mặt hàng --> Item --load-> 20items
	
	// --> Tổng số Item -- TotalItems = 20
	// cấu hình số Item trên một trang --> ItemsPerPage = 4
	// ==> Số page = 20/4 = 5 page
	//     Tăng    = 22/4 = 5.5 pages --> Roundup = 6 pages
	/*
	     Page1: Item 1 - 5
	     Page2: Item 6 - 10
	     Page3: Item 11 - 15
	     Page4: Item 16 - 20
	     Page5: Item 21 - 22
	     
	     
	 */
	public static void main(String[] args) {
		int totalItems = 23;
		int itemsPerPage = 4;
		
		int totalPage = (int)Math.ceil((float)totalItems/itemsPerPage);
		System.out.println("Page: " + totalPage);
		
		System.out.println("\n===========================================\n");
		
		float val = 10f/3;  // 3.3333333
		float val2 = 17f/7; // 2.4285715 cần nhiều hơn 7 chữ số : 0,xxxxxxxxxxxxxxxxxxx
		
		System.out.println("Value: " + val);
		System.out.println("Value2: " + val2);
		
		//BigDecimal dbValue = db(17).divide(db(7)); // Non-terminating decimal expansion; no exact representable decimal result.
		// Math context:
		// Half event: 32 --> 7 chữ số
		// Half event: 64 --> 16 chữ số --> thường dùng
		// Half event: 128 --> 34 chữ số
		
		// Dùng hàm này khi muốn chia lấy kết quả nhiều số thập phần có thể 
		// không quan tâm là bao nhiêu số thập phân phía sau --> rounding mode
		BigDecimal dbValue = db(17).divide(db(7), MathContext.DECIMAL32);
		System.out.println("dbValue: " + dbValue);
		
		// Khi nào cần quan tâm chính xác làm tròn bao nhiêu số và chế độ làm tròn như thế nào
		// int scale: bao nhiêu chữ số thập phân
		// RoundingMode.HALF_UP/ UP / DOWN
		BigDecimal dbValue2 = db(17).divide(db(7), 10, RoundingMode.HALF_UP);
		System.out.println("dbValue2: " + dbValue2);
		
		
	}
}
