package view;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("main method");
		anotherMainMethod();
	}
	
	private static void anotherMainMethod()
	{
		System.out.println("this is a fake main method");
		
	}
}
