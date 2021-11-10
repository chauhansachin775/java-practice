package oops_concepts;

class StaticControlFlow_1 extends Sample_1 {
	
	static int b = m2();
	
	static int m2() {
		System.out.println("inside m2() of StaticControlFlow_1");
		return 20;
	}
	
	static {
		System.out.println("inside static block of StaticControlFlow_1");
	}

	public static void main(String[] args) {
		System.out.println("inside main of StaticControlFlow_1");
		System.out.println("B main a:"+a);
		
		System.out.println("B main b:"+b);
	}

}


class Sample_1{
	
	static int a = m1();
	
	static int m1() {
		System.out.println("inside m1() of Sample_1");
		return 10;
	}
	
	static {
		System.out.println("inside static block of Sample_1");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main of Sample_1");
	}
}