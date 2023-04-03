package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
	public static void main(String[] args) {
		Random rd = new Random();
		int score = 1 + rd.nextInt(10);

		if (score < 5)
			System.out.println("yeu");
		else if (score < 8)
			System.out.println("trung binh");
		else
			System.out.println("gioi");
	}
}
