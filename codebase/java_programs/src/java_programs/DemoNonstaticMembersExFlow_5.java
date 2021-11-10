package java_programs;

// In this example we will get StackOverFlowError
// Because here, we are creating Object at class level without static KW

public class DemoNonstaticMembersExFlow_5 {
	
	//DemoNonstaticMembersExFlow_5 e1 = new DemoNonstaticMembersExFlow_5();
	
	static {
		System.out.println("SB starts");
		System.out.println("SB ends");
		
	}
	
	int x = m1();
	
	//DemoNonstaticMembersExFlow_5 e1 = new DemoNonstaticMembersExFlow_5();
	
	int m1() {
		System.out.println("inside m1");
		return 10;
	}
	
	{
		System.out.println("NSB starts");
		System.out.println("NSB ends");
		
		{
			System.out.println("inside nested NSB");
		}
		
	}
	
	DemoNonstaticMembersExFlow_5(){
		System.out.println("constructor starts");
		System.out.println("constructor ends");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main");
		DemoNonstaticMembersExFlow_5 e1 = new DemoNonstaticMembersExFlow_5();
		System.out.println("main ends");
	}

}
