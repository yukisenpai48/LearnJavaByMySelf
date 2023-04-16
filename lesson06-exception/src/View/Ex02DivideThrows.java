package View;

public class Ex02DivideThrows {
	public static void main(String[] args) {
		System.out.println("Result: " + divide(4, 2));
		System.out.println("Result: " + divide(5, 0));
	}

	public static double divide(int a, int b) throws ArithmeticException{
		return a / b;
	}
}
