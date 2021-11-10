package java_programs;

public class DemoClassLevelVariables_1 {
	
	static int a = 20;
	int x = 40;
	final int y = 60;
	
	static {
		DemoClassLevelVariables_1.m1();
	}
	
	public static void m1() {
		System.out.println("inside m1");
		DemoClassLevelVariables_1.main(new String[0]);
	}

	public static void main(String[] args) {
		System.out.println("inside main");
		System.out.println(a);
		//String[] str = {"sachin", "anil", "akash"};
	}
	
	
	
}
