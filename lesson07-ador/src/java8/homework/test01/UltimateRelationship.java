package java8.homework.test01;

import static utils.DateUtils.*;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class UltimateRelationship {
	public static void main(String[] args) {
		Calendar statTime = null;
		Calendar endTime = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập thời gian bắt đầu hẹ hò");
			statTime = inputCalendarTime(sc);
//			System.out.println("Start time: " + format(statTime, DEFAULT_PATTER));
			if (getRelationshipStat(sc)) {
				endTime = Calendar.getInstance();
			} else {
				System.out.println("Nhập thời gian kết thúc hẹn hò");
				endTime = inputCalendarTime(sc);
			}
			if(!checkValidDate(statTime, endTime, sc)) {
				break;
			}
		} while(true);
		
		
//		System.out.println("End time: " + format(endTime, DEFAULT_PATTER));
		relationshipTime(statTime, endTime);
		System.out.println("\n*************Programing Finished*************");
		sc.close();
	}
	private static boolean getRelationshipStat(Scanner sc) {
		System.out.println("\n============================================");
		System.out.println("Mối quan hệ của bạn vẫn còn hay đã kết thúc ?");
		System.out.println("1: Còn \n0: Đã kết thúc");
		boolean status = true;
		
		do {
			try {
				System.out.print("Nhập tình trạng của bạn là: ");
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
	private static boolean checkValidDate(Calendar startTime, Calendar endTime, Scanner sc) {
		boolean checkState = false; // (Data lỗi: 0: Thoát, 1: Nhập lại), 2: Data bình thường và tiếp tục
		if(startTime.after(endTime)) {
			System.out.println("\n!!!Thời gian bắt đầu hẹ hò và kết thúc không hợp lệ !!!");
			
			do {
				try {
					System.out.println("Bạn có muốn nhập lại thời gian bắt đầu và kết thúc không ?");
					System.out.println("  1: Có\n  0: Không");
					System.out.print("  Nhập lừa chọn của bạn: ");
					int choose = Integer.parseInt(sc.nextLine());
					if (choose < 0 || choose > 1) {
						throw new NumberFormatException();
					}
					checkState = choose == 1 ? true : false;
					break;
				} catch (NumberFormatException e) {
					System.out.println("Vui lòng chọn nhập số nguyên dương 1 hoặc 0 !!!");
				}
				
			}while(true);
		}
			
		return checkState;
	}
	private static void relationshipTime(Calendar startTime, Calendar endTime) {
		ZoneId zoneId = TimeZone.getDefault().toZoneId();
		
		Instant sInstant = startTime.toInstant();
		Instant eInstant = endTime.toInstant();
		
		LocalDateTime sLocalDateTime = LocalDateTime.ofInstant(sInstant, zoneId);
		LocalDateTime eLocalDateTime = LocalDateTime.ofInstant(eInstant, zoneId);
		
		if (sLocalDateTime.isAfter(eLocalDateTime)) {
			System.out.println("\n!!!Thời gian bắt đầu hẹ hò và kết thúc không hợp lệ !!!");
			return;
		}
		LocalDate sdate = sLocalDateTime.toLocalDate();
		LocalTime stime = sLocalDateTime.toLocalTime();
		
		LocalDate edate = eLocalDateTime.toLocalDate();
		LocalTime etime = eLocalDateTime.toLocalTime();
		
		Period period = Period.between(sdate, edate);
		Duration duration = Duration.between(stime, etime);
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("\n===========Dưới này là tổng thời gian hẹn hò của bạn=================");
		System.out.println("             "
				+ optional(period.getYears(), "năm")
				+ optional(period.getMonths(), "tháng")
				+ optional(period.getDays(), "ngày")
				+ optional(duration.toHoursPart(), "giờ")
				+ optional(duration.toMillisPart(), "phút")
				+ optional(duration.toSecondsPart(), "giây"));
		System.out.println("=====================================================================");
		
	}
}
