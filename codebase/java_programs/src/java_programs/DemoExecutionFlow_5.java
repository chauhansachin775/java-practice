package java_programs;

class A5 {
	void m1(float f) {
		System.out.println("A5 float args");
	}
}

class B5 extends A5 {
	void m1(int a) {
		System.out.println("B5 int args");
	}
}

public class DemoExecutionFlow_5 {

	public static void main(String[] args) {
		B5 b1 = new B5();
		b1.m1(50);
		b1.m1('a');
		b1.m1(50L);

		System.out.println();
		A5 a1 = new A5();
		a1.m1(50);
		a1.m1('a');
		a1.m1(50L);
	}
}