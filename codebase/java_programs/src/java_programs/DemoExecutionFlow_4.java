package java_programs;

class A4 {
	void m1(int a) {
		System.out.println("A4 int args");
	}
}

class B4 extends A4 {
	void m1(float f) {
		System.out.println("B4 float args");
	}
}

public class DemoExecutionFlow_4 {

	public static void main(String[] args) {
		B4 b1 = new B4();
		b1.m1(50);
		b1.m1('a');
		b1.m1(50L);

		System.out.println();

		A4 a1 = new B4();
		a1.m1(50);
		a1.m1('a');
		//a1.m1(50L); // error
	}

}
