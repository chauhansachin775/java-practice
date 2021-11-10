package java_programs;

public class DemoNonstaticMembersExFlow_3 {
	
	DemoNonstaticMembersExFlow_3 e1 = new DemoNonstaticMembersExFlow_3();
	
	DemoNonstaticMembersExFlow_3(){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
		DemoNonstaticMembersExFlow_3 e1 = new DemoNonstaticMembersExFlow_3();

	}

}
