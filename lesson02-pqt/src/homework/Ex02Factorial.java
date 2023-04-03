package homework;

public class Ex02Factorial {
	public static void main(String[] args) {
		System.out.println("factorial of 5: " + factorial(5));
		System.out.println(sumOfFactorial(2,3,4));
	
	
	}
	
	private static int sumOfFactorial(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += factorial(number);
		}
		return sum;
	}
	private static int factorial(int n) {
		int result = n;
		while(n>1) {
			result*=--n;
		}
		return result;
	}
}
