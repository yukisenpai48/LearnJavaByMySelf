package homework;

import java.util.Iterator;

public class Ex04MaxOdd {
	public static void main(String[] args) {
		int[] numbers = { 4, 6, 2, 63, 54, 21, 32, 11, 23, 434 };
		System.out.println(findMaxOddElement(numbers));
	}

	private static int findMaxOddElement(int... elements) {
		int max = Integer.MIN_VALUE;
		for (int element : elements) {
			if (isOdd(element) && element > max) {
				max = element;
			}
		}
		if (max == Integer.MIN_VALUE) {
			System.out.println("Array has no Odd element");
		}
		return max;
	}

	private static boolean isOdd(int number) {
		return number % 2 == 1;
	}

	class countOdd {
		int countOdd = 0;
		int max = Integer.MIN_VALUE;
	}
}
