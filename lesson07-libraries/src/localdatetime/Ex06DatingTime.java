package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 10, 1, 23, 10, 40);
		LocalDateTime end = LocalDateTime.now();

		if (end.isBefore(start)) {
			throw new IllegalArgumentException("start must less than endday");
		}

		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();

		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(startTime, endTime);
		if (duration.isNegative()) {
			System.out.println("a");
			period = period.plusDays(-1);
			duration= duration.plusDays(1);
		}
		System.out.println("To String: \n" 
				+ period.getYears() 	   + " years\n"
				+ period.getMonths() 	   + " months\n"
				+ period.getDays()   	   + " days\n"
				+ duration.toHours() 	   + " hours\n"
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds");

	}
}
