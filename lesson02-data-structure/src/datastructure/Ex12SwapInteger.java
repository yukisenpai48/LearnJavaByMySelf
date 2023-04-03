package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = new Integer(22);
		Integer b = new Integer(77);
//		Integer a = 22;
//		Integer b = 77;

		// swap in main method
//		int c = a;
//		a = b;
//		b = c;

//		a = a + b;
//		b = a - b;
//		a = a - b;
		swap(a,b);
		System.out.println(a + " " + b);
		// create separate method to swap
		
	
	}
	
	static void swap(Integer a, Integer b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
	}
}
