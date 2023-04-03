package datastructure;

import bean.Item;

public class Ex07ObjectTypeTest {
	public static void main(String[] args) {
		
		Item itemA = new Item(101, "item A", 200);
		System.out.println("price : " + itemA.price);
		modify(itemA);
		System.out.println("price : " + itemA.price);
		
		
	}
	
	public static void modify(Item item)
	{
		item.price = 888;
		item = new Item(202, "Item y", 555);
		item.price = 999;
		
	}
	
	
}
