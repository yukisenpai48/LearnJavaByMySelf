package homework;

import java.util.Random;

public class Ex01PowerOf2 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(100);
		if (isPowerOf2(number))
			System.out.println(number + " la luy thua cua 2");
		else
			System.out.println(number + " khong phai la luy thua cua 2");
	}

	private static boolean isPowerOf(int a, int b) {
		if (b < 0) {
			return false;
		}
		double n = Math.log(b) / Math.log(a);
		return Math.ceil(n) == Math.floor(n);
	}

	private static boolean isPowerOf2(int number) {
		while (number > 1) {
			if (number % 2 == 1) {
				return false;
			}
			number = number / 2;
		}
		return true;
	}
}
