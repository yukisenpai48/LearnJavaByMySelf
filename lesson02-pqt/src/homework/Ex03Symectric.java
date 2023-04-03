package homework;

public class Ex03Symectric {
	public static void main(String[] args) {
		System.out.println(isSymectric(123321));
	}

	private static boolean isSymectric(int number) {
		int sym = 0;
		int initialNumber = number;
		while (number > 0) {
			sym = sym * 10 + number % 10;
			number /= 10;
		}
		return sym == initialNumber;
	}
}
