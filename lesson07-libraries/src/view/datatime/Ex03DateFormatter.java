package view.datatime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03DateFormatter {
	public static void main(String[] args) {
		// Java7: DateFormat(cha), SimpleDateFormat(con)
		// #format(java.util.Date)
		// "dd/MM/yyyy: trong SimpleDayFormat
		Locale.setDefault(new Locale("en","US"));
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss EEEE a");
		Date date = new Date();
		System.out.println("date: " + df.format(date));
		
		System.out.println();
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		System.out.println("calendar: " + df.format(cDate));
	}
}
