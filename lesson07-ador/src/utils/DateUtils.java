package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class DateUtils {
	private DateUtils() {}
	
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "c should not be null");
		return c.getTime();
	}
	public static Date toDate(String text, String pattern, boolean isLenient) {
		Objects.requireNonNull(text, "c should not be null");
		Objects.requireNonNull(pattern, "pattern should not be null");
		
		DateFormat df = new SimpleDateFormat(pattern);
		df.setLenient(isLenient);
		Date date = null;
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String format(Calendar c, String pattern) {
		Objects.requireNonNull(c, "c should not be null");
		Objects.requireNonNull(pattern, "pattern should not be null");
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(toDate(c));
	}
	
	public static String format(Date date, String pattern) {
		Objects.requireNonNull(date, "Date should not be null");
		Objects.requireNonNull(pattern, "Pattern should not be null");
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	public static Calendar cloneDate(Calendar c) {
		Calendar cloned = Calendar.getInstance();
		cloned.setTime(c.getTime());
		return cloned;
	}
	public static String optional(long value, String unit) {
		if (value <= 0) {
			return "";
		}
		return value + unit +" ";
	}
	public static String optional(String unit, long value) {
		if (value <= 0) {
			return "";
		}
		return unit + " " + value + " ";
	}
	public static Calendar inputCalendarTime(Scanner ip) {
		Calendar setCalendar = Calendar.getInstance();
		int year = 0;
		int month = 0;
		int day = 0;
		
		// input year
		do {
			try {
				System.out.print("Nhập năm: ");
				year = Integer.parseInt(ip.nextLine());
				setCalendar.set(Calendar.YEAR, year);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên dương năm !!!");
			}
		} while(true);
		
		// input month
		do {
			try {
				System.out.print("Nhập tháng: ");
				month = Integer.parseInt(ip.nextLine()) - 1;
				setCalendar.set(Calendar.MONTH, month);
				if (month < Calendar.JANUARY || month > Calendar.DECEMBER) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên dương tháng từ 1 đến 12 !!!");
			}
		} while(true);
		
		// input day and check day of month is valid ?
		setCalendar.set(Calendar.DAY_OF_MONTH, 1);
		int maxDayOfMonth = setCalendar.getActualMaximum(Calendar.DATE);
		do {
			try {
				System.out.print("Nhập ngày: ");
				day = Integer.parseInt(ip.nextLine());
				setCalendar.set(Calendar.DAY_OF_MONTH, day);
				if (day < 1 || day > maxDayOfMonth) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên dương tháng từ 1 đến " + maxDayOfMonth +" !!!");
			}
		} while(true);
		// set time for calendar

		setCalendar = inputTime(setCalendar, ip);
		
		return setCalendar;
	}
	
	public static Calendar inputTime(Calendar calendar, Scanner sc) {
		int hour, minute, second;
		do {
			try {
				System.out.print("Nhập giờ: ");
				hour = Integer.parseInt(sc.nextLine());
				calendar.set(Calendar.HOUR_OF_DAY, hour);
				if(hour < 0 || hour > 23 ) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên dương giờ từ 0 đến 23 !!!");
			}
		} while(true);
		
		do {
			try {
				System.out.print("Nhập số phút: ");
				minute = Integer.parseInt(sc.nextLine());
				calendar.set(Calendar.MINUTE, minute);
				if(minute < 0 || minute > 59 ) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên dương phút từ 0 đến 59 !!!");
			}
		} while(true);
		
		do {
			try {
				System.out.print("Nhập số giây: ");
				second = Integer.parseInt(sc.nextLine());
				calendar.set(Calendar.SECOND, minute);
				if(second < 0 || second > 59 ) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên dương giây từ 0 đến 59 !!!");
			}
		} while(true);
		
		return calendar;
	}
	
	public static LocalDateTime inputLocalDateTime(Scanner ip) {
		LocalDateTime localDateTime = null;
		int year = 0;
		int month = 0;
		int day = 0;
		
		// input year
		do {
			try {
				System.out.print("Nhập năm: ");
				year = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên dương năm !!!");
			}
		} while(true);
		
		// input month
		do {
			try {
				System.out.print("Nhập tháng: ");
				month = Integer.parseInt(ip.nextLine()) - 1;
				if (month < Calendar.JANUARY || month > Calendar.DECEMBER) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên dương tháng từ 1 đến 12 !!!");
			}
		} while(true);
		
		LocalDateTime.of(year, month, day, 0, 0);
		
		return localDateTime;
	}
	public static boolean isSameDate(Calendar date1, Calendar date2) {
		boolean status = false;
//		System.out.println("Year: " + date1.get(Calendar.YEAR) + " - " + date2.get(Calendar.YEAR));
//		System.out.println("Month: " + date1.get(Calendar.MONTH) + " - " + date2.get(Calendar.MONTH));
//		System.out.println("Day: " + date1.get(Calendar.DAY_OF_MONTH) + " - " + date2.get(Calendar.DAY_OF_MONTH));
		if (date1.get(Calendar.YEAR) == date2.get(Calendar.YEAR)
			&& date1.get(Calendar.MONTH) == date2.get(Calendar.MONTH)
			&& date1.get(Calendar.DAY_OF_MONTH) == date2.get(Calendar.DAY_OF_MONTH)) {
			return true;
		}
		return status;
	}
}
