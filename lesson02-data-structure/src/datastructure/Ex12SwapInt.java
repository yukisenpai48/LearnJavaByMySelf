package datastructure;

public class Ex12SwapInt {
	public static void main(String[] args) {
		int a = 12;
		int b = 77;

		// swap in main method
//		int c = a;
//		a = b;
//		b = c;

		a = a + b;
		b = a - b;
		a = a - b;

		// create separate method to swap
		
	
	}
	
	static void swap(int a, int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
	}
}
