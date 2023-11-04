package view.localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime sTime = LocalTime.of(19, 30, 20);
		LocalTime eTime = LocalTime.parse("19:45:10", DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println("sTime: " + sTime);
		System.out.println("eTime: " + eTime);
		
		// Tìm hiệu giữa 2 localTime --> Duration
		Duration duration = Duration.between(sTime, eTime);
		
		System.out.println("duration: " + duration);
		System.out.println("Hour: " + duration.toHours());
		///System.out.println("Days: " + duration.toDays());
		System.out.println("Minutes: " + duration.toMinutesPart());
		System.out.println("Seconds: " + duration.toSecondsPart());
		System.out.println("Hour: " + duration.toMillis());
		
		/*
		  LocalDateTime
		 */
	}
}
