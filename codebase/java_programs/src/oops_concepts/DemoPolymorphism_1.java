package oops_concepts;


class SamplePoly_1 {
	
	static void m1() {
		System.out.println("SamplePoly_1 m1()");
	}
	
	void m2() {
		System.out.println("SamplePoly_1 m2()");
		m1();
	}
	
}

public class DemoPolymorphism_1 extends SamplePoly_1 {

	static void m1() {
		System.out.println("Demo m1()");
	}
	
	public static void main(String[] args) {
		
		DemoPolymorphism_1 obj1 = new DemoPolymorphism_1();
		
		obj1.m1();
		obj1.m2();
		
		System.out.println();
		
		SamplePoly_1 obj2 = new DemoPolymorphism_1();
		
		obj2.m1();
		obj2.m2();

	}

}
