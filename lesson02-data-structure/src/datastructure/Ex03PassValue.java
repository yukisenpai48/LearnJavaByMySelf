package datastructure;

public class Ex03PassValue {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		
		//lam 1 nam
		salary = age;
		age = 24;
		System.out.println(age);
		System.out.println(salary);
	}
}
