package oops_concepts;

class Example_4 {
	
	static int x = 20;
	
	private Example_4() {
		System.out.println("no para private");
	}
	
	Example_4(int a) {
		System.out.println("ex int-param");
	}
	
	
}

public class DemoInheritance_4 extends Example_4 {
		
	public DemoInheritance_4(int a) {
		//System.out.println("hello");
		super(50);
	}
	
	public DemoInheritance_4() {
		super(70);
	}
	
	 static void m1() {
		//int a = super.x;
	}
	
	public static void main(String[] args) {
		DemoInheritance_4 obj  = new DemoInheritance_4(50);
		DemoInheritance_4 obj2 = new DemoInheritance_4();
	}

	}


