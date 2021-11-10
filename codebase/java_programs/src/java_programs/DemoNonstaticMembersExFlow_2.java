package java_programs;

public class DemoNonstaticMembersExFlow_2 {
	
	int x = m1();
	
	int m1() {
		System.out.println("NSV x");
		return 10;
	}
	
	{
		System.out.println("NSB1");
	}
	
	DemoNonstaticMembersExFlow_2(){
		System.out.println("no arg constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main");
		DemoNonstaticMembersExFlow_2 e1 = new DemoNonstaticMembersExFlow_2();
		
	}
	
	{
		System.out.println("NSB2");
	}
	
	int y = m2();
	
	int m2() {
		System.out.println("NSV y");
		return 20;
	}

}
