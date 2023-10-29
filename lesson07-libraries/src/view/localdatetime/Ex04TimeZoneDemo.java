package view.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex04TimeZoneDemo {
	public static void main(String[] args) {
		// Timezone = ZoneId(java7)
		// GTM+7, UTC+7
		// Europe/Berlin, ICT, HST
		ZoneId zId = ZoneId.of("Europe/Berlin");
		
		LocalDateTime ldatetime = LocalDateTime.now(zId);
		
		System.out.println("ldatetime: " + ldatetime);
		
		// Lưu trữ --> LocalDate, LocalDatTime, LocalTime : Java08
		// Xử lý  --> Dùng java08
		// Khi nào trong java08 không xử lý được --> chuyển sang Calender, Date để dùng hàm xử lý trong java07
		
	}
}
