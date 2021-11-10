package java_programs;

public class DemoStaticMethod_1 {

	static int a = m1();

	static int m1() {
		System.out.println("in static int m1");
		a = 50;
		System.out.println(a);
		 return 10;

	}

	public static void main(String[] args) {

		System.out.println(a);

	}

}
