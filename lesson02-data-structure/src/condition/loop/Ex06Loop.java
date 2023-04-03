package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		/*
		 * for (int i = 0; i <= 10; i++) { System.out.println(i); }
		 * 
		 * int i = 0; while (i<10) { System.out.print(i + " "); i++; }
		 */

		String numberAsText = "";
		Scanner sc = new Scanner(System.in);
		int dem = 0;
		do {
			System.out.println("ban con " + (3 - dem) + " lan thu");
			System.out.print("Nhap vao so: ");
			numberAsText = sc.nextLine();
			dem++;
		} while (dem < 3 && !numberAsText.matches("\\d+"));
		if (dem <= 3) {
			int number = Integer.parseInt(numberAsText);
			System.out.println("number: " + number);
		}
	}
}
