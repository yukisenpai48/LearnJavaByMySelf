package View;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int yob = Integer.parseInt(scanner.nextLine());
		
		int curYear = Year.now().getValue();
		System.out.println("He/She is " + (curYear - yob) + " year old");
	
		scanner.close();
	}
}
