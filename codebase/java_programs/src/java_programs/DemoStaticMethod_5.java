package java_programs;

public class DemoStaticMethod_5 {

	static int a = m1();

	static int m1() {
		System.out.println("in m1");
		return 10;
	}

	static int m2() {
		System.out.println("in m2");
		return 50;
	}

	public static void main(String[] args) {

		System.out.println("in main");
		System.out.println(a);
		System.out.println(b);

	}

	static int b = m2();

}
