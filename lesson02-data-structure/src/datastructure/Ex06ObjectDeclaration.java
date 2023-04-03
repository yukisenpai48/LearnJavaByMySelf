package datastructure;

import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		int number = 10;
//		--> lưu trữ ở STACK
		
//		--> lƯU TRỮ Ở HEAP
		Item itemA = new Item();
		System.out.println("item id: " + itemA.id);
		System.out.println("item name: " + itemA.name);
		System.out.println("item price: " + itemA.price);
		
		Item itemB = new Item(number, "item B", 100);
	}
}
