package java_programs;

public class DemoStaticMethod_2 {
	static int a = 10;
	static int b = 20;

	static void m1() {
		System.out.println("in static void m1");
		int a = 120;
		int b = 150;
		System.out.printf("local variable a and b are: %d %d \n", a, b);

	}

	public static void main(String[] args) {
		m1();
		System.out.println(a);
		System.out.println(b);

	}

}
