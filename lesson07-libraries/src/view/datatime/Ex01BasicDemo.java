package view.datatime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		  Java 7 trở về trước: Java.util.Date, java.util.Calendar 
		  Date: thường được dùng để lưu trữ
		  		không hỗ trợ quá nhiêu hàm xử lý(Deprecated from 1.1)
		  
		  Calendar: Có khả năng cho phép lưu trữ
		  			Hỗ trợ các hàm xử lý nhiều
		  
		 */
		
		// demo with java.util.Date
		Date date = new Date();
		System.out.println("date: " + date); // Sat Oct 21 19:43:44 ICT 2023 (os time)
		
		Date configuredDate = new Date(720004);
		System.out.println("date: " + configuredDate); //
		
		System.out.println("==========================================\n");
		System.out.println("TimeZone: " + TimeZone.getDefault());
		printAvaibleTimeZones();
		
		
		// demo with calendar(code with style of singleton pattern)
		/*
		 Calender time: java.util.GregorianCalendar[time=1697893283010,
		 				areFieldsSet=true,areAllFieldsSet=true,
		 				lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Bangkok",
		 				offset=25200000,dstSavings=0,useDaylight=false,transitions=3,
		 				lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,
		 				YEAR=2023,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,
		 				DAY_OF_YEAR=294,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,
		 				HOUR=8,HOUR_OF_DAY=20,MINUTE=1,SECOND=23,MILLISECOND=10,
		 				ZONE_OFFSET=25200000,DST_OFFSET=0]
		 */
		Calendar c = Calendar.getInstance();
		System.out.println("Calender time: " + c);
		
		System.out.println("\n\n\n===============Debug=================");
		
		TimeZone tzBerlin = TimeZone.getTimeZone("JST");
		Calendar cBerlin = Calendar.getInstance(tzBerlin);
		System.out.println("calender berlin time: " + cBerlin);
		
		// calendar: fields[]
		//cBerlin.set(Calendar.YEAR, 2000); // fields[1] = 2000
		int year = cBerlin.get(Calendar.YEAR);
		int month = cBerlin.get(Calendar.MONTH);
		int day = cBerlin.get(Calendar.DAY_OF_MONTH);
		int hour = cBerlin.get(Calendar.HOUR_OF_DAY);
		int munute = cBerlin.get(Calendar.MINUTE);
		int second = cBerlin.get(Calendar.SECOND);
		System.out.println("Berlin time: " + year +"/"+month+"/"+day + "-" + hour + ":" + munute + ":" + second);
	}
	
	private static void printAvaibleTimeZones() {
		String[] timz =  TimeZone.getAvailableIDs();
		for(String str: timz) {
			System.out.println("TzID: " + str);
		}
	}
}
