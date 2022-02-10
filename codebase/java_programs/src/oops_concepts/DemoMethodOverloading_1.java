package oops_concepts;

public class DemoMethodOverloading_1 {
	
	void m1(int a) {
		System.out.println("int args");
	}
	
	void m1(char ch) {
		System.out.println("char arg");
	}

	public static void main(String[] args) {
		
		DemoMethodOverloading_1 obj1 = new DemoMethodOverloading_1();
		
		obj1.m1(99);
		obj1.m1('c');
		obj1.m1((char)100);
		obj1.m1((int)'d');
		
		System.out.println();
		
		int i1 = 97;
		int i2 = 'a';
		
		char ch1 = 98;
		char ch2 = 'b';
		
		obj1.m1(i1);
		obj1.m1(i2);
		obj1.m1(ch1);
		obj1.m1(ch2);
		
		System.out.println();
		
		obj1.m1((char)i1);
		obj1.m1((int)ch1);
		
		System.out.println();
		obj1.m1(i1 + i2);
		obj1.m1(ch1 + ch2);
		
		System.out.println();
		obj1.m1(10 + 'a');
		obj1.m1('A' + 'B');
		obj1.m1((char)('A' + 'B'));
		obj1.m1((char)'a' + 'b');
		
		

	}

}
