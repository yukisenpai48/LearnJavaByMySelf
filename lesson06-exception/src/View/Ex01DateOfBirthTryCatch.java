package View;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int yob = 0;
		// use try catch block
		do {
			try {
				System.out.println("Enter year of birth: ");
				yob = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input!!!");
			}
		} while (true);
		
		int curYear = Year.now().getValue();
		System.out.println("He/She is " + (curYear - yob) + " year old");

		scanner.close();
	}
}
