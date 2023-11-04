package java8.homework.test03;

import static utils.DateUtils.inputCalendarTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class CheckDayInfo {
	private static final String[] LOCAL = {"Việt Nam", "Mỹ", "Nhật Bản", "Trung Quốc", "Pháp"};
	private static final String[] TIMEZONE_ID = {"Asia/Ho_Chi_Minh", "America/New_York",
												"Asia/Yakutsk", "Asia/Macao", "America/Cayenne"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDateTime currentDate =  null;
		
		currentDate = chooseCountry(sc);
		System.out.println("\n***************************** Thông tin về tháng hiện tại *****************************");
		printLastDayOfMonth(currentDate);
		printDateInfo(currentDate);

		System.out.println("\n********************************** Thông tin cá nhân **********************************");
		Calendar statTime = null;
		Calendar endTime = null;
		do {
			System.out.println("Nhập ngày tháng năm sinh của bạn");
			statTime = inputCalendarTime(sc);
			endTime = Calendar.getInstance();
			
			if(!checkValidDate(statTime, endTime, sc)) {
				break;
			}
		} while(true);
		relationshipTime(statTime, endTime);
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Kết thúc chương trình <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		sc.close();
	}
	
private static void relationshipTime(Calendar startTime, Calendar endTime) {
		TimeZone sTz = startTime.getTimeZone();
		ZoneId sZid = sTz.toZoneId();
		LocalDateTime startDate = LocalDateTime.ofInstant(startTime.toInstant(), sZid);
		
		TimeZone eTz = startTime.getTimeZone();
		ZoneId eZid = eTz.toZoneId();
		LocalDateTime endDate = LocalDateTime.ofInstant(endTime.toInstant(), eZid);
		
//		System.out.println("start Date: " + startDate);
//		System.out.println("end Date: " + endDate);
		
		LocalDate sdate = startDate.toLocalDate();
		LocalTime stime = startDate.toLocalTime();
		
		LocalDate edate = endDate.toLocalDate();
		LocalTime etime = endDate.toLocalTime();
		
		long betweenDays = Duration.between(sdate.atStartOfDay(), edate.atStartOfDay()).toDays();
		
		// Tính hiệu
		Period period = Period.between(sdate, edate);
		Duration duration = Duration.between(stime, etime);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
//		long millisecond = duration.toMillis();
//		long hours = TimeUnit.MILLISECONDS.toHours(millisecond);
//		
//		millisecond = millisecond - TimeUnit.HOURS.toMillis(hours);
//		long minutes = TimeUnit.MILLISECONDS.toMinutes(millisecond);
//		
//		millisecond = millisecond - TimeUnit.MINUTES.toMillis(minutes);
//		long seconds = TimeUnit.MILLISECONDS.toSeconds(millisecond);
//		
//		
//		System.out.println("Milisecon: " + millisecond);
//		System.out.println("hours: " + hours);
//		System.out.println("minutes: " + minutes);
//		System.out.println("seconds: " + seconds);
		
		System.out.println("\n===========Bạn đã sống được chừng này thời gian=================");
		System.out.println("             Tổng số ngày là: " + betweenDays + " ngày");
		System.out.println("             "	
								+ period.getYears() + " tuổi "
								+ period.getMonths() + " tháng "
								+ period.getDays() +  " ngày - "
								+ duration.toHoursPart() + " tiếng "
								+ duration.toMinutesPart() + " phút "
								+ duration.toSecondsPart() + " giây"
								);
	}
	
	private static boolean checkValidDate(Calendar startTime, Calendar endTime, Scanner sc) {
		boolean checkState = false; // (Data lỗi: 0: Thoát, 1: Nhập lại), 2: Data bình thường và tiếp tục
		if(startTime.after(endTime)) {
			System.out.println("\n!!! Thời gian năm sinh của bạn không hợp lệ !!!");
			
			do {
				try {
					System.out.println("Bạn có muốn nhập lại ngày tháng năm sinh ko ?");
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
	private static void printDateInfo(LocalDateTime lcdtime) {
		
		LocalDate tempLcdtime = lcdtime.toLocalDate();
		
		int dayOfWeek = tempLcdtime.getDayOfWeek().getValue();
		
		// first day of this week
		tempLcdtime = tempLcdtime.minusDays(dayOfWeek);
		System.out.println("Ngày đầu tiên của tuần hiện tại là ngày: " + tempLcdtime.getDayOfMonth() 
									 + "/" + tempLcdtime.getMonthValue());
		
		// last day of week
		tempLcdtime =  tempLcdtime.plusDays(6);
		System.out.println("Ngày cuối cùng của tuần hiện tại là ngày: "  + tempLcdtime.getDayOfMonth()
									+ "/" + tempLcdtime.getMonthValue());
		// Week of year
		tempLcdtime = lcdtime.toLocalDate();
		int wOfY = tempLcdtime.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
		System.out.println("Tuần này là tuần: " + wOfY + " của năm");
		
		// after 20 day is ...?
		tempLcdtime = tempLcdtime.plusDays(20);
		System.out.println("20 ngày sau sẽ là ngày " + tempLcdtime.getDayOfMonth() + "/" 
													 + tempLcdtime.getMonthValue());
	}

	private static void printLastDayOfMonth(LocalDateTime ldatetime) {
		LocalDate localDate = ldatetime.toLocalDate();
		System.out.println("Ngày cuối cùng của tháng " + localDate.getMonthValue() + " là ngày " + localDate.lengthOfMonth());
	}
	
	private static LocalDateTime chooseCountry(Scanner sc) {
		System.out.println("Chọn đất nước bạn cần kiểm tra thông tin thời gian");
		for(int i = 0; i < LOCAL.length; i++) {
			System.out.print("   " + i + " : " + LOCAL[i] + "\n");
		}
		
		// choose country
		int chooseCounty = 0;
		do {
			try {
				System.out.print("==>Lựa chọn của bạn là: ");
				chooseCounty = Integer.parseInt(sc.nextLine());
				if (chooseCounty < 0 || chooseCounty >= LOCAL.length) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("!!!Thông bạn nhập vô không hợp lệ !!!!");
				System.out.println("    Vui lòng nhập từ 0 đến " + (LOCAL.length - 1));
			}
		} while(true);
		
		// TimeZone timeZone = TimeZone.getTimeZone(TIMEZONE_ID[chooseCounty]);
		
		ZoneId zId = ZoneId.of(TIMEZONE_ID[chooseCounty]);
		LocalDateTime ldatetime = LocalDateTime.now(zId);
		
		System.out.println("\n*************************************** Kết quả ***************************************");
		System.out.println("Thông tin thời gian của nước " + LOCAL[chooseCounty] + " là: "
							+ "ngày " + ldatetime.getDayOfMonth() + " "
							+ "tháng " + ldatetime.getMonthValue() + " "
							+ "năm " + ldatetime.getYear() + " "
							+ " - "
							+ ldatetime.getHour() + " giờ "
							+ ldatetime.getMinute() + " phút "
							+ ldatetime.getSecond() + " giây"
							);
		
		return ldatetime;
	}
}
