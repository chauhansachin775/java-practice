package oops_concepts;

class A3 {
	
	void m1() {
		System.out.println("A m1");
	}
	
	void m2() {
		System.out.println("A m2");
		m1();
	}
}

class B3 extends A3 {
	
	void m1() {
		System.out.println("B m1");
	}
	
	void m3() {
		System.out.println("B m3");
		m1();
		super.m2();
	}
}

class C3 extends B3 {
	
	void m2() {
		System.out.println("C m2");
		//m4();
	}
}

public class DemoPoly_3 extends C3{
	
	void m1() {
		System.out.println("DemoPoly_3 m1");
	}
	
	void m2() {
		System.out.println("DemoPoly_3 m2");
	}
	
	void m4() {
		System.out.println("DemoPloy_3 m4");
	}

	public static void main(String[] args) {
		
		DemoPoly_3 obj = new DemoPoly_3();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

}
