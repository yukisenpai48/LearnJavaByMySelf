package homework;

import java.util.Random;

public class Ex07RandomFiveNumberBetween20And50 {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		Random rd = new Random();
		int i = 0;
		
		while(i<5){
			int number = 20 + rd.nextInt(31);
			if (!isExist(numbers, number, i)) {
				numbers[i] = number;
				i++;
			}
		}
		for (i = 0; i<5; i++)
			System.out.println("number " + (i+1) + ": " + numbers[i]);
	}

	private static boolean isExist(int[] numbers, int number, int index) {
		int i = 0;
		while (i < index) {
			if (numbers[i] == number)
				return true;
			i++;
		}
		return false;
	}
}
