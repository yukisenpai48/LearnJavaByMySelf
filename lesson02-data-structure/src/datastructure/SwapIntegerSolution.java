package datastructure;

import bean.CustomInteger;

public class SwapIntegerSolution {
	
	
	public static void main(String[] args) {
		CustomInteger vA = new CustomInteger(100);
		CustomInteger vB = new CustomInteger(200);
		
		swap(vA, vB);
		
		System.out.println("vA: " + vA);
		System.out.println("vB: " + vB);
	}
	
	public static void swap(CustomInteger a, CustomInteger b)
	{
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
		
	}
}
