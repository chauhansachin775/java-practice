package oops_concepts;

class ExampleDemoPoly_1 {
	
	
	private void m1() { 
		System.out.println("static A m1"); }
	 
	
	void m2() {
		System.out.println("non static A m2");
		m1();
	}
	
}

public class DemoPoly_1 extends ExampleDemoPoly_1 {
	
	void m1() {
		System.out.println("static B m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoPoly_1 obj1 = new DemoPoly_1();
		obj1.m1();
		obj1.m2();
		
		ExampleDemoPoly_1 obj2 = new DemoPoly_1();
		//obj2.m1();
		obj2.m2();

	}

}
