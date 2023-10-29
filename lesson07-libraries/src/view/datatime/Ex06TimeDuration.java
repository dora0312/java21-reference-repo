package view.datatime;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06TimeDuration {
	public static void main(String[] args) {
		Date start = DateUtils.toDate("15/10/2023 22:00:00", "dd/MM/yyyy HH:mm:ss", false);
		Date end = Calendar.getInstance().getTime();
		
		// Năm, Tháng, Ngày, Giờ, Phút, Giây
		
		if(start.after(end)) {
			throw new IllegalArgumentException("Date is invalid");
		}
		
		long startTime = start.getTime();
		long endTime = end.getTime();
		long duration = endTime - startTime;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toSeconds(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("days: " + days);
		System.out.println("hours: " + hours);
		System.out.println("minutes: " + minutes);
		System.out.println("seconds: " + seconds);
		
		/*
		 Hạn chế của DateTime trước java 8
		  +) Date, Calendar luôn lưu trữ dMy Hms -> ko hỗ trợ riêng lẽ
		  	--> Khó khăn khi lưu trữ cũng như chuyển đổi qua về với date(dMy) trong database
		  +) Ít hỗ trợ hàm để tìm hiệu giữa hai mốc thời gian
		 
		 */
		
	}
}
