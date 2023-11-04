package view.datatime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex02GetDateTimeInfo {
	public static void main(String[] args) {
		// Lấy thông tin thời gian hiện tại với [timezone]

		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		c.set(Calendar.YEAR, 2023);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DAY_OF_MONTH, 29);
		// + 1. Ngày, Tháng, Năm
		String date = c.get(Calendar.DAY_OF_MONTH) + "/"
					+ c.get(Calendar.MONTH) + "/"
					+ c.get(Calendar.YEAR);
		System.out.println("1.Ngày tháng năm: " + date);
		
		// +2.Giờ 12-24, Phút, Giây
		String time = c.get(Calendar.HOUR) + " " + (c.get(Calendar.AM_PM) != 1 ? "AM" : "PM");
		System.out.println("2.Time: " + time);
		
		// +3. Ngày trong tuần(thứ mấy): 1(sunday),2,...7(saturday)
		int dow =  c.get(Calendar.DAY_OF_WEEK);
		String [] dayOfWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
		System.out.println("3.Day of weeks: " + dayOfWeeks[dow - 1]);
		
		// +4. Đếm số ngày trong tháng, năm hiện tại >> Calendar
		int dayInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("4.Day in month: " + dayInMonth);
		
		int dayInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Day in year: " + dayInYear);
		
		// +5. Kiểm tra năm hiện tại có phải là năm nhuận không ?
		GregorianCalendar gc = new GregorianCalendar();
		boolean isLeapYear = gc.isLeapYear(Calendar.YEAR);
		System.out.println("Is leap year: " + (isLeapYear == true ? "YES" : "NO"));
		
		// +6. Ngày đầu tiên trong tuần là ngày thứ mấy ?
		
		String fdow = dayOfWeeks[c.getFirstDayOfWeek() - 1];
		System.out.println("Firt day of week: " + fdow);
		
		// +7. Ngày đầu tiên trong tuần hiện tại là ngày mấy ?
		Calendar cloned = Calendar.getInstance(new Locale("vi", "VN"));
		cloned.setTimeInMillis(c.getTimeInMillis());
		
		int duration = cloned.getFirstDayOfWeek() - dow;
		cloned.add(Calendar.DAY_OF_MONTH, dow == Calendar.SUNDAY ? duration - 7 : duration);
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		int thisMonth = cloned.get(Calendar.MONTH) + 1;
		
		// int fwowAsNumber = c.get(Calendar.DAY_OF_MONTH) + c.getFirstDayOfWeek() - dow;
		System.out.println("Ngày đầu tiên trong tuần: " + fdowAsNumber + "/" + thisMonth);
	}
}
