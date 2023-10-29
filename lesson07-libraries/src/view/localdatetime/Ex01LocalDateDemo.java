package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDateDemo {
	/*
	 LocalDate --> d/M/y -> weekday, dayOfMonth,..
	 		   --> builder(advance)
	 */
	public static void main(String[] args) {
		LocalDate sDate = LocalDate.now()
				.withYear(2022)
				.withMonth(10)
				.withDayOfMonth(24)
				;
		
		LocalDate eDate = LocalDate.parse("25/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
							.plusDays(0); 
		
		System.out.println("ldate: " + format(sDate, "dd/MM/yyyy EEEE"));
		System.out.println("eDate: " + format(eDate, "dd/MM/yyyy EEEE"));
		
		// Hiệu giữa 2 localdate --> Period
		Period period = Period.between(sDate, eDate);
		System.out.println("period: " + period);
		
		System.out.println("period year: " + period.getYears());
		System.out.println("period month: " + period.getMonths());
		System.out.println("period day: " + period.getDays());
		int years = period.getYears();
		int month = period.getMonths();
		int days = period.getDays();
		
		System.out.println("Optional date: "
				+ optional(years, "year")
				+ optional(month, "month")
				+ optional(days, "day"));
		
	}
	
	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(ldate);
	}
	private static String optional(int value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + "" + unit + (value > 1 ? "s" : "") + " ";
	}
}
