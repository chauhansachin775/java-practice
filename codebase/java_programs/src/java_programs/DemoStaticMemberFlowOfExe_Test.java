package java_programs;

public class DemoStaticMemberFlowOfExe_Test {
	
	 static int a = 60;
	 
	
	static {
		System.out.println(a);
		System.out.println("in Test, static block");
		System.out.println(DemoStaticMemberFlowOfExe_Example.b);
	}
	
	
	//static int a = 60;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(DemoStaticMemberFlowOfExe_Example.a);
		//System.out.println("hello my name is sachin");
		System.out.println("");
	}

}
