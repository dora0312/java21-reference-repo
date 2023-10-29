package java7.homework.test01;

import static utils.DateUtils.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UltimateRelationship {
	public static void main(String[] args) {		
		System.out.println("Nhập thời gian bắt đầu hẹ hò");
		
		Calendar statTime = null;
		Calendar endTime = null;
		Scanner sc = new Scanner(System.in);
		statTime = inputCalendarTime(sc);
//		System.out.println("Start time: " + format(statTime, DEFAULT_PATTER));

		if (getRelationship(sc)) {
			endTime = Calendar.getInstance();
		} else {
			System.out.println("Nhập thời gian kết thúc hẹn hò");
			endTime = inputCalendarTime(sc);
		}
//		System.out.println("End time: " + format(endTime, DEFAULT_PATTER));
		
		relationshipTime(statTime, endTime);
		
		sc.close();
	}
	private static boolean getRelationship(Scanner sc) {
		System.out.println("\n============================================");
		System.out.println("Mối quan hệ của bạn vẫn còn hay đã kết thúc ?");
		System.out.println("1: Còn \n0: Đã kết thúc");
		boolean status = true;
		
		do {
			try {
				System.out.print("Tình trạng của bạn là: ");
				int answer = Integer.parseInt(sc.nextLine());
				if (answer < 0 || answer > 1) {
					throw new NumberFormatException();
				}
				status = answer == 0 ? false:true;
				break;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng chọn nhập số nguyên dương 1 hoặc 0 !!!");
				System.out.println("1: Còn \n0: Đã kết thúc");
			}
		} while (true);
		System.out.println("============================================");
		
		return status;
	}
	
	private static void relationshipTime(Calendar startTime, Calendar endTime) {

		
		Date startDate = startTime.getTime();
		Date endDate = endTime.getTime();
		
		long sTime = startDate.getTime();
		long eTime = endDate.getTime();
		long duration = eTime - sTime;
		
		// get years
		long days = TimeUnit.MILLISECONDS.toDays(duration); 
		int years = (int)days/365;

		Calendar diffCal = Calendar.getInstance();
		diffCal.setTimeInMillis(duration);
		int months = ((diffCal.get(Calendar.YEAR) - 1970) * 12) + diffCal.get(Calendar.MONTH);
		// get months
		months = months % 12;
		// get days
		int tdays   = diffCal.get(Calendar.DAY_OF_MONTH) - 1;
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("\n===========Dưới này là tổng thời gian hẹn hò của bạn=================");
		System.out.println("             "	+ optional(years, "năm")
								+ optional(months, "tháng")
								+ optional(tdays, "ngày")
								+ optional(hours, "tiếng")
								+ optional(minutes, "phút")
								+ optional(seconds, "giây"));
		System.out.println("=====================================================================");
		
	}
}
