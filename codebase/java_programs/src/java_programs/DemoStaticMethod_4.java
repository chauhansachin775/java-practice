package java_programs;

public class DemoStaticMethod_4 {

	static int a = 10;
	static int b = 20;

	static void m1(int a) {
		System.out.println(a);
		a = 120;
		System.out.println(a);
		System.out.println(DemoStaticMethod_4.a);
		m2(1);

	}

	static void m2(int b) {
		System.out.println(b);
		b = 600;
		DemoStaticMethod_4.b = 50;
		System.out.println(b);
		System.out.println(DemoStaticMethod_4.b);

	}

	public static void main(String[] args) {
		int a = 400;
		m1(a);
		System.out.println(a);
		DemoStaticMethod_4.a = 9000;
		DemoStaticMethod_4.b = 6000;
		System.out.println(DemoStaticMethod_4.a);
		System.out.println(b);

	}

}
