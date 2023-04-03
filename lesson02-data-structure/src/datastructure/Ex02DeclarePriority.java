package datastructure;

public class Ex02DeclarePriority {
	private static int number = 99;
	public static void main(String[] args) {
		int number = 10;
		System.out.println("number: " + number);
		System.out.println("number: " + Ex02DeclarePriority.number);
		test();
	}
	private static void test() {
		System.out.println("number: " + number);
	}
}
