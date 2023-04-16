package view;

public class Ex01IsPower {
	public static void main(String[] args) {
		System.out.println(isPowerOf(0.5, 0.125));
	}
	
	public static boolean isPowerOf(double a, double b) {
		if (a == b)
			return true;
		if(a*b < 1) {
			if (a > b) {
				double temp = a;
				a = b;
				b = temp;
			}
		}
		else if (a < b) {
			double temp = a;
			a = b; 
			b = temp;
		}
		// a luon lon hon b
		System.out.println(a + " " + b);
		while(true) {
			if (a % b == 0) {
				a /= b;
				System.out.println(a + " " + b);
				if (a == b)
					return true;
			}
			else
				return false;
		}
	}
}
