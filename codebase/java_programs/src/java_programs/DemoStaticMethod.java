package java_programs;

public class DemoStaticMethod {

	static int a= 10;
	
	static void m1() {
		
		System.out.println("in static m1");
		a= 50;
	}
	
	public static void main(String[] args) {
		int a= 90;
		System.out.println(DemoStaticMethod.a);
		System.out.println(a);
		m1();
		System.out.println(DemoStaticMethod.a);
		

	}

}
