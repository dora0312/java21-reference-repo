package view.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex02Format {
	public static void main(String[] args) {
		// singleton pattern: cho việc khởi tạo đối tượng
		//					Class chỉ áp dụng singleton, chỉ cho phép tạo ra duy nhất 1 đối tường cho class đó.
		// NumberFormat: Sử dụng format có sẵn trong class --> Không thể biến đổi
		
		double value = 7223932432222.34d;
		
		// locale(language,country): vị trí, định vị của mỗi quốc gia, khu vực
		// default setting của java: en_US
		System.out.println("Value: " + value);
		
		NumberFormat nf = NumberFormat.getInstance(); // Singleton pattern
		String fmtValue = nf.format(value);
		System.out.println("Formated: " + fmtValue);
		
		nf = NumberFormat.getInstance(new Locale("vi", "VN"));
		
		String custom = nf.format(value);
		System.out.println("Custom format: " + custom);
		
		nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		
		String custom2 = nf.format(value);
		System.out.println("Custom format2: " + custom2);
		
		value = 67725.434d;
		DecimalFormat df = new DecimalFormat("#,###.##");
		String dfValue = df.format(value);
		System.out.println("dfValue: " + dfValue);
	}
	
}
