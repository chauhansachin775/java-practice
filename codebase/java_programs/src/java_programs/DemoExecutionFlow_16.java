package java_programs;

class A16{
	static int x = m1();
	static int m1() {
		System.out.println("A m1");
		x = 50;
		return 60;
	}
}
class B16 extends A16{
	static int x;
	static int m1() {
		System.out.println("B m1");
		x = 70;
		return 80;
	}
}

public class DemoExecutionFlow_16 {

	public static void main(String[] args) {
		B16 b = new B16();
		A16 a = b;
		System.out.println(b.x);
		System.out.println(a.x);
	}
}