package oops_concepts;

class P5 {
	static void m1() {
		System.out.println("P m1");
	}
	
	static void m2() {
		System.out.println("P m2");
		m1();
	}
}

class Q5 extends P5 {
	static void m1() {
		System.out.println("Q m1");
	}
	
	void m3() {
		System.out.println("Q m3");
		m1();
		super.m2();
	}
}

class R5 extends Q5 {
	static void m2() {
		System.out.println("R m2");
		m4();
	}
}

public class DemoPolymorphism_5 extends R5 {
	
	static void m1() {
		System.out.println("Demo m1");
	}
	
	static void m2() {
		System.out.println("Demo m2");
	}
	
	static void m4() {
		System.out.println("Demo m4");
	}
	public static void main(String[] args) {
		
		DemoPolymorphism_5 obj1 = new DemoPolymorphism_5();
		
		obj1.m3();

	}

}
