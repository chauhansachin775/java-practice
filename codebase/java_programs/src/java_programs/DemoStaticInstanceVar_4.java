package java_programs;

public class DemoStaticInstanceVar_4 {

	static int a = 20;

	void m1() {
		a = 50;

	}

	 void m2() {

		System.out.println(a);
	}

	public static void main(String[] args) {
		DemoStaticInstanceVar_4 obj = new DemoStaticInstanceVar_4();

		obj.m2();
		obj.m1();
		obj.m2();

	}

}
