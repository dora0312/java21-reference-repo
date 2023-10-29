package view.localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;

public class Ex03LocalDateTimeDemo {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime sdatetime = LocalDateTime.of(2023, 10, 15, 20, 20, 10);
		LocalDateTime edatetime = LocalDateTime.parse("28/10/2023 17:40:50", dtf);
		
		System.out.println("sdatetime" + sdatetime);
		System.out.println("edatetime" + edatetime);
		if (sdatetime.isAfter(edatetime)) {
			throw new IllegalArgumentException("DateTime is invalid");
		}
		
		LocalDate sdate = sdatetime.toLocalDate();
		LocalTime stime = sdatetime.toLocalTime();
		
		LocalDate edate = edatetime.toLocalDate();
		LocalTime etime = edatetime.toLocalTime();
		
		// Tính hiệu
		Period period = Period.between(sdate, edate);
		Duration duration = Duration.between(stime, etime);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("\nReuslt --> "
							+ optional(period.getYears(), "year")
							+ optional(period.getMonths(), "month")
							+ optional(period.getDays(), "day")
							+ optional(duration.toHoursPart(), "hour")
							+ optional(duration.toMillisPart(), "minute")
							+ optional(duration.toSecondsPart(), "second"));
	}
}
