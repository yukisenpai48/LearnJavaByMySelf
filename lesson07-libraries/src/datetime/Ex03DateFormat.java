package datetime;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03DateFormat {
	public static void main(String[] args) {
//		String pattern = "dd/MM/yyyy hh:mm:ss a";
//		String pattern = "dd/MM/yyyy HH:mm:ss";
		String pattern = "dd/MM/yyyy EEEE hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		String formated = df.format(date);
		System.out.println(formated);
		
		System.out.println("==================");
		String birthDayAsString = "18/7/1999";
		df = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Date parse = df.parse(birthDayAsString);
			Calendar parseCalendar = Calendar.getInstance();
			parseCalendar.setTime(date);
			System.out.println(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
