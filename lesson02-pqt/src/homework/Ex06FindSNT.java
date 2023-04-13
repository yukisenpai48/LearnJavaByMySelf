package homework;

import java.util.Scanner;

public class Ex06FindSNT {
	public static void main(String[] args) {
		int stt;
		System.out.println("Ban muon tim SNT thu bao nhieu?");
		stt = inputNumber();
		
		int number = findSNT(stt);
		System.out.println("SNT thu " + stt + " la: " + number);
	}
	
	public static int inputNumber() {
		Scanner scanner = new Scanner(System.in);
		String numberAsString = "";

		do {
			System.out.print("Input your number: ");
			numberAsString = scanner.nextLine();
		} while (!numberAsString.matches("\\d+"));

		return Integer.parseInt(numberAsString);
	}
	
	public static int findSNT(int stt) {
		if (stt <= 0)
			return -1;
		int index = 0;
		int number = 2;
		do {
			while (!isSNT(number)) {
				number++;
			}
			index++;
			number++;
		}while(index < stt);
		
		return --number;
	}

	public static boolean isSNT(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number%i == 0)
				return false;
		}
		return true;
	}
}
