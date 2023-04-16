package View;

import java.util.Scanner;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		/**
		 * password requirements 1. at least 8 characters 2. at most 256 characters
		 * 
		 */
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");

		String password = ip.nextLine();
		boolean isPassed = false;
		try {
			isPassed = validate(password);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		if (isPassed) {
			System.out.println("Create account successful");
		}

		System.out.println("Finished ...");
	}

	private static boolean validate(String password) {
		int len = password.length();

		if (len < 8) {
			throw new IllegalArgumentException("at least 8 character");
			// System.out.println("at least 8 character");
			// return false;
		}
		if (len > 256) {
			throw new IllegalArgumentException("at most 256 character");
//			System.out.println("at most 256 character");
//			return false;
		}
		// at least one lower character
		boolean atLeastOneLowerCharacter = false;
		for (int i = 0; i < len; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerCharacter = true;
				break;
			}
		}

		if (!atLeastOneLowerCharacter) {
			throw new IllegalArgumentException("at least one lower character");
//			System.out.println("at least one lower character");
		}
		return atLeastOneLowerCharacter;
	}
}
