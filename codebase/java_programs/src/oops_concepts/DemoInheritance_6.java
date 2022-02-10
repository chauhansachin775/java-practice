package oops_concepts;

class Example_6 {
	
	int x = 10;
	int y = 20;
	
	void m1() {
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this);
	}
	
}

public class DemoInheritance_6 extends Example_6 {
	
	int x = 100;
	int y = 200;
	
	void m2() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(this);
	}

	public static void main(String[] args) {
		
		DemoInheritance_6 obj1 = new DemoInheritance_6();
		DemoInheritance_6 obj2 = new DemoInheritance_6();
		
		obj2.x = 700;
		obj2.y = 800;
		
		obj1.m1();
		obj1.m2();
		
		System.out.println();
		
		obj2.m1();
		obj2.m2();

	}

}
