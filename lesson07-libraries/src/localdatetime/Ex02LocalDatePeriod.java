package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		// localdate dd/MM/yyyy
		// period: find distance from start(localdate) until end(localday)
		LocalDate end = LocalDate.now();
		LocalDate start = LocalDate.of(2019, 2, 6);
		
		Period period = Period.between(start, end);
		System.out.println("period: " + period); // P4Y2M14D
		System.out.println("To String: \n" + period.getYears() + " years\n"
							+ period.getMonths() + " months\n"
							+ period.getDays() + " days");
	
	
	}
}
