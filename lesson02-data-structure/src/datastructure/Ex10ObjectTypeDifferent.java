package datastructure;

public class Ex10ObjectTypeDifferent {
	public static void main(String[] args) {
		// String, Integer, Double, Float, Character
		// Kiểu đối tượng và chỉ có duy nhất 1 thông tin
		// thuộc tính (bên trong)

		// Lưu trữ giá trị ở HEAD --> không thay đổi được
		String s1 = "Hello";
		String s2 = "welcome";
		String s3 = s1;

		System.out.println(System.identityHashCode(s3));
		s3 = "s";
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s1));

		System.out.println("====================");
		String o1 = new String("hello");
		String o2 = new String("welcome");
		String o3 = new String("hello");
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o3));

		
	}
}
