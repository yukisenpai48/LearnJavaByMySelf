package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
		// lấy thông tin thời gian và timezone
		// 1. Ngày tháng năm hiện tại
		Date now = new Date();
		System.out.println(now.toString());

		// @deprecated == outdate -> should not use
		// Date notNow = new Date(2023, 1, 1);
		// Epoch = Unit time = January 1, 1970, 00:00:00 GMT
		Date notNow = new Date(1681700387278l);
		System.out.println("not now: " + notNow.toString());

		// singleton design pattern
		// idea: mỗi class chỉ cho phép tạo ra 1 đối tượng
		Calendar cNow = Calendar.getInstance();
		// System.out.println("c --> " + cNow);

		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		System.out.println("cNow: " + dayOfMonth + "/" + month + "/" + year);

		Calendar cNotNow = Calendar.getInstance();
		// 17/8/1999 --> dayOfWeek, dayOfYear
		cNotNow.set(1999, Calendar.AUGUST, 17);
		System.out.println("dayofweek: " + cNotNow.get(Calendar.DAY_OF_WEEK));
		System.out.println("dayofyear: " + cNotNow.get(Calendar.DAY_OF_YEAR));

		// 2. giờ 12 -24. phút giây hiện tại
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" + cNotNow.get(Calendar.MINUTE) + ":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);

		// 3. in ra thứ , tuần trong tháng, năm
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		String[] weekdays = { "", "Chủ Nhật", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7" };
		System.out.println("Day of week: " + weekdays[dow]);

		// 5. kiểm tra năm nhuận
		GregorianCalendar gc = new GregorianCalendar();
		gc.isLeapYear(2024);

		// 6. lấy ngày đầu tuần theo locale
		
		// locale(language, country)
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("VN FDOW: " + c1.getFirstDayOfWeek());
		
		// 7. ngày đầu tiên trong tuần hiện tại là ngày mấy
		Calendar today = Calendar.getInstance();
		// 8. in ra danh sách các ngày trong tuần hiện tại
		System.out.println("=======================");
		
	}

}
