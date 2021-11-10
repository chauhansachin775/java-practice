package java_programs;

class Source {

	int a = 10;
	int b = 20;

	//Source s1 = new Source();
	

}

public class DemoThisKw_6 extends Source{

	int x = 41;
	int y = 42;

	void m1() {
		System.out.println(a);
		System.out.println(b);
		a = 123;
		b = 456;

		System.out.println(a);
		System.out.println(b);
		
		x = 80;
		y = 90;
	}

	public static void main(String[] args) {
		DemoThisKw_6 obj1 = new DemoThisKw_6();
		Source s= new Source();
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		System.out.println();
		
		
		System.out.println(s.a);
		System.out.println(s.b);
		
		System.out.println();
		
		obj1.m1();
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		System.out.println(s.a);
		System.out.println(s.b);
	}

}
