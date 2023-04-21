package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
	public static void main(String[] args) {
		
		/**
		 * int --> BigInteger
		 * double --> BigDecimal
		 *
		 *hỗ trợ:
		 * 1. lưu trữ số lớn (không in ra E^x)	
		 * 2. hỗ trợ rounding, scale nhiều hơn
		 * 3. hỗ trợ các hàm tính toán + - * /
		 * 
		 * --> commercial round
		 */
		BigDecimal value = BigDecimal.valueOf(12345678987654.2567)
									 .setScale(3,RoundingMode.HALF_UP);
		System.out.println(value);
		
		BigDecimal a = BigDecimal.valueOf(10);
		BigDecimal b = BigDecimal.valueOf(5);

		System.out.println("sum: " + a.add(b));
		System.out.println("sub: " + a.subtract(b));
		System.out.println("mul: " + a.multiply(b));
		System.out.println("div: " + a.divide(b));
		
		
	
	}
}
