package java_programs;

public class DemoStaticMemberFlowOfExe_Example {

	static int a=10 ;

	static {
		System.out.println("in Example, static block 1");
		b= 900;
		//System.out.println(b); we can access b varible by giving full qualified name
		//accessing b variable with class name. e.g--> classname.b

	}

	static {
		System.out.println("in Example, static block 2");
		DemoStaticMemberFlowOfExe_Example.main(null);

	}

	static int b = m1();

	static int m1() {
		System.out.println("in Example, static method m1");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("in Example main");
		m2();

	}

	static int c = 30;

	static void m2() {
		System.out.println("in Example, static method m2");
	}

}
