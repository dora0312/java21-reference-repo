package view.datatime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04DataConverter {
	public static void main(String[] args) {
		DateFormat df =  new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);  // format in rage
		
		Calendar c =  Calendar.getInstance();
		Date date = new Date();
		
		String text = "24/10/2023";
		
		// converter
		Date convertedDate = c.getTime();
		System.out.println("calendar -> date: " + convertedDate);
		
		//String 
		
	}
}
