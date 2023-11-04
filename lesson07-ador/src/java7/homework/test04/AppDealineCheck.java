package java7.homework.test04;

import static utils.DateUtils.isSameDate;

import java.util.Calendar;

public class AppDealineCheck {
	private static final int LENGHT_HOLLIDAY = 5;
	private static final int DEALINE_DAYS = 110;
	public static void main(String[] args) {
		Calendar[] allHollidays = new Calendar[LENGHT_HOLLIDAY];
		setHoliday(allHollidays);
		Calendar startOfDealine = Calendar.getInstance();

		// Start day 
		startOfDealine.set(2022, Calendar.JUNE, 7);
		System.out.println("Start Dealine: " + startOfDealine.get(Calendar.DAY_OF_MONTH) 
											 + "/" + (startOfDealine.get(Calendar.MONTH) + 1)
											 + "/" + startOfDealine.get(Calendar.YEAR));

		Calendar endOfDealine = getLastDayOfDealine(allHollidays, startOfDealine, DEALINE_DAYS);
		System.out.println("Dealine of " + DEALINE_DAYS + " days is: " + endOfDealine.get(Calendar.DAY_OF_MONTH)
													  + "/" + (endOfDealine.get(Calendar.MONTH) + 1)
													  + "/" + endOfDealine.get(Calendar.YEAR));
	}
	private static void setHoliday(Calendar[] allHollidays) {
		int[][] hollidayList = {
							   {2022, Calendar.JUNE, 22},		// Nghỉ ngày của đàn ông
							   {2022, Calendar.JULY, 26},		// Ngày nghỉ đặc biệt
							   {2022, Calendar.SEPTEMBER, 1},	// Nghỉ tiền lễ ngày quốc khánh Việt Nam
							   {2022, Calendar.SEPTEMBER, 2},	// Nghỉ chính lễ ngày 2/9
							   {2022, Calendar.OCTOBER, 20}		// Nghỉ phụ nữ Việt Nam
							  };
		// Set holiday
		for(int i = 0; i < hollidayList.length; i++) {
			allHollidays[i] = Calendar.getInstance();
			int year = hollidayList[i][0];
			int month = hollidayList[i][1];
			int day = hollidayList[i][2];
			allHollidays[i].set(year, month, day);
		}
	}
	private static Calendar getLastDayOfDealine(Calendar[] allHollidays, Calendar startDealine, int dealineDay) {
		int countDay = 0;
		Calendar dealineDate = (Calendar)(Calendar)startDealine.clone();
		// first is not holiday ?
		do {
			// is not holiday ?
			if(!isHolliday(allHollidays, dealineDate) && countDay <= dealineDay) {
				countDay++;
				if(countDay >= dealineDay) {
					break;
				}
			}
			dealineDate.add(Calendar.DAY_OF_MONTH, 1);
		} while(true);
		return dealineDate;
	}
	private static boolean isHolliday(Calendar[] allHollidays, Calendar today) {
		int day = today.get(Calendar.DAY_OF_WEEK);
		// day is weekend day ?
		if(day == Calendar.SATURDAY || day == Calendar.SUNDAY) {
			return true;
		}
		for(int i = 0; i < allHollidays.length; i++) {
			boolean isHolliday = isSameDate(today, allHollidays[i]);
			if(isHolliday) {
				return true;
			}
		}
		return false;
	}
}
