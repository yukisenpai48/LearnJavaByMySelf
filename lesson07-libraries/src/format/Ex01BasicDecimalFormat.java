package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	
	/**
	 * #: ký tự số - optinal (có / không)
	 * 0: ký tự số - required
	 * ,: ngăn cách phần nguyên
	 * .: ngăn cách phần thập phân
	 */
	
	private static final String PATTERN = "#,###.##";
	public static void main(String[] args) {
		System.out.println(3587934934231023l);

		System.out.println(3587934934231023d);
		
		//vấn đề
		// khi một số thực đủ lớn (>= 8 chữ số) thì java tự động chuyển đổi 
		// sang E^x khi in ra
		Locale.setDefault(new Locale("da","DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formated = df.format(1234567348952485204.659d);
		System.out.println("formated : " + formated);
		
		
	}
}
