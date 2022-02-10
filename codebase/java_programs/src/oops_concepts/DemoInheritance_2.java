package oops_concepts;

class Example {
	
	static int a = 50;
	int x = 200;
	
	final char ch = 's';
	
}

public class DemoInheritance_2 extends Example {
	
	static int p = 70;
	int z = 450;

	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(Example.a);
		System.out.println(DemoInheritance_2.a);
		
		DemoInheritance_2 obj = new DemoInheritance_2();
		//
		System.out.println(obj.x);
		System.out.println(obj.a);
		System.out.println(obj.ch);
		
		obj.ch = 'u';
		System.out.println();
		
		Example e = obj;
		System.out.println(e.x);
		System.out.println(e.a);
		e.ch = 'p';
		fvf2
		//System.out.println(e.p);
		//System.out.println(e.z);
		
		
		
		
	
	
	}

}
