package java_programs;

public class DemoStaticMemberFlowOfExe_Example_2 {
	
	 static class Sachin{
		int rollNum;
		String name;
		double salary;
		
	 static class Laptop{
		String model;
	}
	}
	
	static class Anil{
		String color;
	}
	
	static {
		System.out.println(DemoStaticMemberFlowOfExe_Example_2.a);
	}

	public static void main(String[] args) {
		System.out.println(a);
	//	DemoStaticMemberFlowOfExe_Example_2 e1 = new DemoStaticMemberFlowOfExe_Example_2();
	//	Sachin sc = new Sachin();
	//	System.out.println(sc.name);
		
		DemoStaticMemberFlowOfExe_Example_2.Sachin sc1 = new DemoStaticMemberFlowOfExe_Example_2.Sachin();
		DemoStaticMemberFlowOfExe_Example_2.Sachin.Laptop lap = new DemoStaticMemberFlowOfExe_Example_2.Sachin.Laptop();
	}
	
	static int a=10;

}
