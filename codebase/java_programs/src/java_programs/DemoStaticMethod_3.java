package java_programs;

public class DemoStaticMethod_3 {

	static int a = 10;
	static int b = 20;

	static void m1(int a) {
		System.out.println(a);
		a = 120;
		System.out.println(a);
		System.out.println(DemoStaticMethod_3.a);
		m2(1);

	}
	
	static void m2(int b) {
		System.out.println(b);
		b= 600;
		DemoStaticMethod_3.b= 50;
		System.out.println(b);
		System.out.println(DemoStaticMethod_3.b);
		
	}

	public static void main(String[] args) {
		int a = 400;
		m1(a);
		System.out.println(a);

	}

}
