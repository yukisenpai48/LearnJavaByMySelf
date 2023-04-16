package View;

import java.util.Scanner;

public class Ex05MultipleExceptions {
	public static void main(String[] args) {
		System.out.println(findX());					
	}
	
	private static double findX() {
		Scanner ip = new Scanner(System.in);
		
		try {
			System.out.print("enter a: ");
			int a = Integer.parseInt(ip.nextLine());
			
			System.out.print("enter b: ");
			int b = Integer.parseInt(ip.nextLine());
			
			return -b*1.0/a;
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return Integer.MIN_VALUE;
	}
}
