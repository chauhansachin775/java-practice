package oops_concepts;

class SampleNs_1 {
	
	int x = m1 ();
	
	int m1() {
		System.out.println("inside m1() of SampleNs");
		return 10;
	}
	
	{
		System.out.println("inside NSB of SampleNs");
	}
	
	SampleNs_1(){
		System.out.println("inside constructor of SampleNs");
	}
	
}

public class NonStaticControlFlow_1 extends SampleNs_1 {
	
	int y = m2();
	
	int m2() {
		System.out.println("inside m2() of NSCF");
		return 20;
	}
	
	{
		System.out.println("inside NSB of NSCF");
	}
	
	NonStaticControlFlow_1(){
		System.out.println("inside constructor of NSCF");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside main");
		NonStaticControlFlow_1 obj1 = new NonStaticControlFlow_1();
		System.out.println("x:"+obj1.x);
		System.out.println("y:"+obj1.y);

	}

}
