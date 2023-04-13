package homework;

import java.util.Scanner;

public class Ex05DecToBin {
	public static void main(String[] args) {
		int number;

		Scanner scanner = new Scanner(System.in);
		String numberAsString = "";

		do {
			System.out.print("Input your number: ");
			numberAsString = scanner.nextLine();
		} while (!numberAsString.matches("\\d+"));

		number = Integer.parseInt(numberAsString);

		System.out.println(number + " in binary: " + decimalToBinary(number));
	}

	public static String decimalToBinary(int number) {
		String result = "";
		while (number > 0) {
			result = number % 2 + result;
			number /= 2;
		}
		return result;
	}
}
