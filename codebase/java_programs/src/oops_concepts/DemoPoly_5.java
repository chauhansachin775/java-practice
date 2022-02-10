package oops_concepts;

class A5 {
	
	static int a = 10;
	int x = 20;
	
	static void m1() {
		System.out.println("A m1");
	}
	
	void m2() {
		System.out.println("A m2");
	}
	
	void m3() {
		System.out.println("A m3");
		System.out.println("A a: "+a);
		System.out.println("A x: "+x);
		m1();
		m2();
		
	}
}

class B5 extends A5{
	
	static int a = 50;
	int x = 60;
	
	static void m1() {
		System.out.println("B m1");
	}
	
	
	void m2() {
		System.out.println("B m2");
		System.out.println("B a: "+a);
		System.out.println("B x: "+x);
	}
	
	void m4() {
		super.a = a - 10;
		super.x = x - 10;
	}
	
}

public class DemoPoly_5 {

	public static void main(String[] args) {
		
		B5 obj1 = new B5();
		B5 obj2 = new B5();
		A5 obj3 = new B5();
		
		obj1.a = 15;
		obj1.x = 16;
		
		obj2.a = 18;
		obj2.x = 19;
		
		obj1.m4();
		//System.out.println();
		obj2.m4();
		
		obj1.m3();
		System.out.println();
		obj2.m3();
		
		System.out.println();
		
		System.out.println(obj1.a);
		System.out.println(obj3.a);
		
		System.out.println(obj1.x);
		System.out.println(obj3.x);

	}

}
