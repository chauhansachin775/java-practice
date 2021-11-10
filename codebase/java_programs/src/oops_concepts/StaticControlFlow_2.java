package oops_concepts;

class Sample_2 {
	
	static int a = 10;
	
	static {
		System.out.println("inside SB of Sample_2");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("b:"+StaticControlFlow_2.b);
		
		//Sample_2 s1 = new StaticControlFlow_2(); 
		//StaticControlFlow_2 obj = (StaticControlFlow_2)s1;
		
		System.out.println("b:"+getB());  //write StaticControlFlow_2.getB();
	}
}
public class StaticControlFlow_2 extends Sample_2 {
	
	static int b = 20;
	
	static {
		System.out.println("inside SB of StaticControlFlow_2");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("b:"+getB());
	}
	
	static int getB() {
		return b;
	}

	public static void main(String[] args) {
		
		System.out.println("inside main");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		

	}

}
