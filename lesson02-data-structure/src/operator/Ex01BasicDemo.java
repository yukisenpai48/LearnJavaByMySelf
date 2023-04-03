package operator;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
			
		// = += -= *= /= 
		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//++ -- prefix, suffix
		System.out.println(a++);
		System.out.println(++b);
		
		//== != >=
		
		
		a+=b--;
		// týõng ðýõng: 
		a = a + b--;
		
		int i =2;
		if (++i >= 3 && i++ > 3)
			i++; 
		
	}
}
