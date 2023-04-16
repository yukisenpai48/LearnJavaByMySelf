package View;

import java.util.Random;

import Exception.InvalidAgeException;

public class Ex06VoteApp {
	public static void main(String[] args) {
		int age = 15 + new Random().nextInt(6);

		boolean isValid = false;
		try {
			isValid = validate(age);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("isValid: " + isValid);
	}

	private static boolean validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be greater or equal 18");
		}
		return true;
	}
}
