package java_programs;

class A13{
	int x = m1();
	int m1() {
		System.out.println("A13 m1");
		return 50;
	}
}
class B13 extends A13{
	int y = m1();
	int m1() {
		System.out.println("B13 m1");
		return 60;
	}
}

public class DemoExecutionFlow_13 {

	public static void main(String[] args) {
		B13 b = new B13();
		System.out.println(b.x);
		System.out.println(b.y);

	}
}