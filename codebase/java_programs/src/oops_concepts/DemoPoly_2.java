package oops_concepts;

class ExampleDemoPoly_2 {
	
	void m1() {
		System.out.println("Example m1");
	}
	
	void m2() {
		System.out.println("Exaple m2");
	}
	
	void m3() {
		System.out.println("Example m3");
	}
}

public class DemoPoly_2 extends ExampleDemoPoly_2{
	
	void m1() {
		super.m2();
		System.out.println("Sample m1");
	}
	
	void m2() {
		super.m2();
		System.out.println("Sample m2");
	}

	public static void main(String[] args) {
		DemoPoly_2 obj1= new DemoPoly_2();
		obj1.m1();
		obj1.m2();
		obj1.m3();

	}

}
