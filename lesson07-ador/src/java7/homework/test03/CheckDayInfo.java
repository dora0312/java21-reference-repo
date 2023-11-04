package java7.homework.test03;

import static utils.DateUtils.inputCalendarTime;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class CheckDayInfo {
	private static final String[] LOCAL = {"Việt Nam", "Mỹ", "Nhật Bản", "Trung Quốc", "Pháp"};
	private static final String[] TIMEZONE_ID = {"Asia/Ho_Chi_Minh", "America/New_York", "JST", "CST","America/Cayenne"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar currentDate =  null;
		
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
		Date startDate = startTime.getTime();
		Date endDate = endTime.getTime();
		System.out.println("getTime: " + startDate + " - " + endDate);
		
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
		
		System.out.println("************************** Bạn đã sống được chừng này thời gian *************************");
		System.out.println("                      Tổng số ngày là: " + days + " ngày");
		System.out.println("                      "	
								+ years + " tuổi "
								+ months + " tháng "
								+ tdays + " ngày - "
								+ hours + " tiếng "
								+ minutes + " phút "
								+ seconds + " giây");
		
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
	private static void printDateInfo(Calendar calendar) {
		
		Calendar tempCalendar = (Calendar)(Calendar)calendar.clone();
		int dayOfWeek = tempCalendar.get(Calendar.DAY_OF_WEEK);
		int firstDayOfWeek = dayOfWeek - 1;
		
		// first day of week
		tempCalendar.add(Calendar.DAY_OF_MONTH, -firstDayOfWeek);
		System.out.println("Ngày đầu tiên của tuần hiện tại là ngày: " 
							+ tempCalendar.get(Calendar.DAY_OF_MONTH) 
							+ "/" 
							+ (tempCalendar.get(Calendar.MONTH) + 1));
		// last day of week
		tempCalendar.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println("Ngày cuối cùng của tuần hiện tại là ngày: " 
							+ tempCalendar.get(Calendar.DAY_OF_MONTH) 
							+ "/" 
							+ (tempCalendar.get(Calendar.MONTH) + 1));
		
		// Week of year
		tempCalendar = (Calendar)(Calendar)calendar.clone();
		int wOfY = tempCalendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Tuần này là tuần: " + wOfY + " của năm");
		
		// after 20 day is ...?
		tempCalendar.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("20 ngày sau sẽ là ngày " + tempCalendar.get(Calendar.DAY_OF_MONTH) + "/" 
													 + (tempCalendar.get(Calendar.MONTH) + 1));
	}
	
	private static void printLastDayOfMonth(Calendar calendar) {
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Ngày cuối cùng của tháng " + (calendar.get(Calendar.MONTH) + 1 ) + " là ngày " + lastDay);
	}
	
	private static Calendar chooseCountry(Scanner sc) {
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
		
		TimeZone timeZone = TimeZone.getTimeZone(TIMEZONE_ID[chooseCounty]);	
		Calendar currentDate = Calendar.getInstance(timeZone);
		
		System.out.println("\n*************************************** Kết quả ***************************************");
		System.out.println("Thông tin thời gian của nước " + LOCAL[chooseCounty] + " là: "
							+ "ngày " + currentDate.get(Calendar.DAY_OF_MONTH) + " "
							+ "tháng " + (currentDate.get(Calendar.MONTH) + 1) + " "
							+ "năm " + currentDate.get(Calendar.YEAR) + " "
							+ "- "
							+ currentDate.get(Calendar.HOUR_OF_DAY) + " giờ" + " "
							+ currentDate.get(Calendar.MINUTE) + " phút" + " "
							+ currentDate.get(Calendar.SECOND) + " giây"
							);
		
		return currentDate;
	}
}
