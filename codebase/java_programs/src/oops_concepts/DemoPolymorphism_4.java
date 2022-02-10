package oops_concepts;

class P4 {
	void m1() {
		System.out.println("P m1");
	}
	
	void m2() {
		System.out.println("P m2");
		m1();
	}
	
}

class Q4 extends P4 {
	void m1() {
		System.out.println("Q m1");
	}
	
	void m3() {
		System.out.println("Q m3");
		m1();
		super.m2();
	}
}

class R4 extends Q4 {
	void m2() {
		System.out.println("R m2");
		//m4();
	}
}


public class DemoPolymorphism_4 extends R4 {
	
	void m1() {
		System.out.println("Demo m1");
	}
	
	void m2() {
		System.out.println("Demo m2");
	}
	
	void m4() {
		System.out.println("Demo m4");
	}

	public static void main(String[] args) {
		
		DemoPolymorphism_4 obj1 = new DemoPolymorphism_4();
		
		//obj1.m1();
		//obj1.m2();
		obj1.m3();
		//obj1.m4();

	}

}
