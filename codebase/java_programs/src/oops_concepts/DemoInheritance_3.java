package oops_concepts;

class Example_3 {
	
	static int a = 10;
	
	static {
		
		System.out.println("in A SB");
		System.out.println("a:"+a);
		//System.out.println("b:"+b);
		System.out.println("b:"+DemoInheritance_3.b);
		//System.out.println("b:"+DemoInheritance_3.getB());
	}
	
}

public class DemoInheritance_3 extends Example_3 {
	
	//static int b = 50;
	
	static {
		System.out.println("in Demo SB");
		System.out.println("a:"+a);
		System.out.println("b:"+DemoInheritance_3.b);
		System.out.println("b:"+getB());
	}
	
	int getB() {
		return b;
	}
		
	static int b = 50;
		
	public static void main(String[] args) {
		
		System.out.println("in B main");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}

}
