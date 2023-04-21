package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex04LocalTimeDuration {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(23, 59, 59);
		
		Duration dr = Duration.between(start, end);
		System.out.println("duration: " + dr);
		System.out.println("duration to string: \n"
							+ dr.toHours() + " hours\n"
							+ dr.toMinutesPart() + " minutes\n"
							+ dr.toSecondsPart() + " seconds");
	}
}
