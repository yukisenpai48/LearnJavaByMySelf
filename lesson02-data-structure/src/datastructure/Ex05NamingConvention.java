package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		//Ten class Camel case --> chữ cái đầu tiên viết hoa
		//ten biến: chữ cái đầu tiên viết thường
		//tên hàm: chữ cái đầu viết thường
		//			Là động từ
		int length = 10;
		int salesPrice = 100;
		
		int a = 5, b = 10;
		System.out.println(sumOfTwoNumber(a, b));
		
	}
	
	private static int sumOfTwoNumber(int a, int b)
	{
		
		return a+b;
	}
}
