package java_programs;

//No StackOverFlowError

public class DemoNonstaticMembersExFlow_4 {
	
	static DemoNonstaticMembersExFlow_4 e1 = new DemoNonstaticMembersExFlow_4();
	
	static {
		System.out.println("SB starts");
		System.out.println("SB ends");
	}
	
	{
		System.out.println("NSB starts");
		System.out.println("NSB ends");
	}
	
	DemoNonstaticMembersExFlow_4(){
		System.out.println("constructor starts");
		System.out.println("constructor ends");	
	}
	
	public static void main(String[] args) {
		// No StackOverFlowError
		System.out.println("inside main");
	}

}
