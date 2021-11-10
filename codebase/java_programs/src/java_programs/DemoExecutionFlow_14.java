package java_programs;

class A14{
	int x = m1();
	static int m1() {
		System.out.println("A14 m1");
		return 50;
	}
}
class B14 extends A14{
	int y = m1();
	static int m1() {
		System.out.println("B14 m1");
		return 60;
	}
}
public class DemoExecutionFlow_14 {

	public static void main(String[] args) {
		B14 b = new B14();
		System.out.println(b.x);
		System.out.println(b.y);
	}
}