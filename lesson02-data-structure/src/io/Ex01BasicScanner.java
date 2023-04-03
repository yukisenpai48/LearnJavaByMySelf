package io;

import java.util.Scanner;

public class Ex01BasicScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter your first name: ");
		String firstName = scanner.nextLine();
		
		
		System.out.print("enter your last name: ");
		String lastName = scanner.nextLine();

		System.out.print("enter your age: ");
		int age = scanner.nextInt();
		
		System.out.print("email: ");
		String email = scanner.nextLine();
		
		System.out.println("full name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
	}
}
