package oops_concepts;

class P6 {
	static int a = 10;
	
	int x =  20;
	
	static void m1() {
		System.out.println("P m1");
		
	}
	
	void m2() {
		System.out.println("P m2");
	}
	
	void m3() {
		System.out.println("P m3");
		
		System.out.println("P a: "+a);
		System.out.println("P x: "+x);
		
		m1();
		m2();
	}
}

class Q6 extends P6 {
	
	static int a = 50;
	
	int x = 60;
	
	static void m1() {
		System.out.println("Q m1");
	}
	
	void m2() {
		System.out.println("Q m2");
		
		System.out.println("Q a: "+a);
		System.out.println("Q x: "+x);
	}
	
	void m4() {
		super.a = a - 10;
		super.x = x - 10;
	}
	
	
}

public class DemoPolymorphism_6 {

	public static void main(String[] args) {
		
		Q6 obj1 = new Q6();
		
		Q6 obj2 = new Q6();
		
		P6 obj3 = new Q6();
		
		obj1.a = 15;
		obj1.x = 16;
		
		obj2.a = 18;
		obj2.x = 19;
		
		obj1.m4();
		obj2.m4();
		
		obj1.m3();
		
		System.out.println();
		
		obj2.m3();
		
		System.out.println();
		
		System.out.println(obj1.a); //18
		
		System.out.println(obj3.a); //8
		
		System.out.println(obj1.x); //16
		
		System.out.println(obj3.x); // 20
		

	}

}
