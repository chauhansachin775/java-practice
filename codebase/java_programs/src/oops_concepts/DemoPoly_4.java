package oops_concepts;

class A4 {
	static void m1() {
		System.out.println("A m1");
	}
	
	static void m2() {
		System.out.println("A m2");
		m1();
	}
}

class B4 extends A4 {
	static void m1() {
		System.out.println("B m1");
	}
	
	void m3() {
		System.out.println("B m3");
		m1();
		super.m2();
	}
}

class C4 extends B4 {
	static void m2() {
		System.out.println("C m2");
		//m4();
	}
}

public class DemoPoly_4 extends C4 {

	static void m1() {
		System.out.println("D m1");
	}
	
	static void m2() {
		System.out.println("D m2");
	}
	
	static void m4() {
		System.out.println("D m4");
	}
	
	public static void main(String[] args) {
		DemoPoly_4 obj = new DemoPoly_4();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

	}

}
