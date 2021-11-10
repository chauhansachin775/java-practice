package java_programs;

public class DemoStaticMethod_7 {

	static int a;
	static int b;

	static void m1() {
		a = 10;
		b = 20;
		m2(a, b);
	}

	static void m2(int a, int b) {
		a = 100;
		b = 200;

	}

	public static void main(String[] args) {
		m1();
		System.out.println(a);
		System.out.println(b);
		

	}

}
