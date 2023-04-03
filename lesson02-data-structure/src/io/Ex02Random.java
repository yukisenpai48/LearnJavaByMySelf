package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rand = new Random();
		
		//1. random 1 so nguyen
		int randomNumber = rand.nextInt();
		System.out.println("random number: " + randomNumber);
		
		//2 random 1 so ngau nhien tu 0 den 10 (ko gom 10)
		randomNumber = rand.nextInt(10);
		System.out.println("random number: " + randomNumber);
		
		
		//3. random trong khoang a den b
		//vd: tu 100 den 200
		randomNumber = 100 + rand.nextInt(100);
		System.out.println("random number: " + randomNumber);
		
		
		
		
	}
}
