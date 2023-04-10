package view;

import bean.Rectangle;

public class Ex01RecApp {
	public static void main(String[] args) {
		//1. create a Rectangle object [10,5]
		Rectangle r1 = new Rectangle();
		r1.setWidth(10); 
		r1.setHeight(5);
		System.out.println("r1: \n" + r1);
		
		Rectangle r2 = new Rectangle(6, 7);
		System.out.println("r2: \n" + r2);
	}
	
}
