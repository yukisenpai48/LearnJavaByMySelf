package condition.loop;

import java.util.Random;

public class Ex04SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int month = 1 + new Random().nextInt(12);
		switch (month) {
		case 1:
		case 3: 
		case 5:
		case 7: 
		case 8:
		case 10: 
		case 12:
			break;
		}
	}
	
}
