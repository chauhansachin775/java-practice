package java_programs;

public class DemoStaticMemberFlowOfExe {

	static int a = m1();

	static int m1() {
		System.out.println("in static m1");
		return 10;
	}

	static {
		System.out.println("in static block");
		a= 100;
	}

	static {
		System.out.println("in second static block");
		b= 500;
		main(new String [1]);
	}

	public static void main(String[] args) {
		System.out.println("in main method");
		System.out.println(a);
		System.out.println(b);
	}

	static int b = m2();

	static int m2() {
		System.out.println("in static m2");
		return 20;
	}
}
