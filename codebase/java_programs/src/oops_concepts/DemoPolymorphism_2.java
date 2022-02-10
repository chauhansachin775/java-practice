package oops_concepts;

class SamplePoly_2 {
	
	void m1() {
		System.out.println(" Sample m1()");
		
	}
	
	void m2() {
		System.out.println("Sample m2()");
		m1();
	}
}

public class DemoPolymorphism_2 extends SamplePoly_2 {

	void m1() {
		System.out.println("Demo m1()");
	}
	
	
	
	public static void main(String[] args) {
		
		DemoPolymorphism_2 obj1 = new DemoPolymorphism_2();
		
		obj1.m1();
		obj1.m2();
		
		System.out.println();
		
		SamplePoly_2 obj2 = new DemoPolymorphism_2();
		
		obj2.m1();
		obj2.m2();

	}

}
