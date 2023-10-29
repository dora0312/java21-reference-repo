package view.datatime;

import static utils.DateUtils.*;

import java.util.Calendar;

public class Ex05WeekdayCounter {
	private static final String DEFAULT_PATTERN = "dd/MM/yyyy";
	public static void main(String[] args) {
		// Đếm xem tháng hiện tại có bao nhiêu ngày chủ nhật
		Calendar now = Calendar.getInstance();
		// now.set(2020, Calendar.SEPTEMBER, 10);
		System.out.println("Hiện tại: " + format(now, DEFAULT_PATTERN));
		
		// Tìm ngày đầu tháng
		Calendar start = cloneDate(now);
		start.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Ngày đầu tháng: " + format(start, DEFAULT_PATTERN));
		
		// Tìm ngày cuối tháng
		Calendar end = cloneDate(now);
		end.set(Calendar.DAY_OF_MONTH, now.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Ngày cuối tháng: " + format(end, DEFAULT_PATTERN));
		
		Calendar startNewMonth = cloneDate(end);
		Calendar cal = start;
//		startNewMonth.add(Calendar.DAY_OF_MONTH, 1);
//		for(Calendar cal = start; cal.before(startNewMonth); ) {
//			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//				System.out.println(format(cal, "dd/MM/yyyy EEEE"));
//				cal.add(Calendar.DAY_OF_MONTH, 7);
//			} else {
//				cal.add(Calendar.DAY_OF_MONTH, 1);
//			}
//		}
		while(cal.before(startNewMonth)) {
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(format(cal, "dd/MM/yyyy EEEE"));
				cal.add(Calendar.DAY_OF_MONTH, 7);
				continue;
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
