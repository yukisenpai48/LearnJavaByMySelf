package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		// tao 100 mau xe audi voi cac mau khac nhau
		Random rd = new Random();
		String[] colors = { "yellow", "red", "blue", "while", "black" };
		for (int i = 1; i <= 100; i++) {
			Car car = new Car(i+1, colors[rd.nextInt(colors.length)]);
		}
	}
}
