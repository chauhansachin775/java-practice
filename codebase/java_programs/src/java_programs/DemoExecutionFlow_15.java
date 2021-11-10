package java_programs;

class A15{
	int x = m1();
	int m1() {
		System.out.println("A m1");
		x = 50;
		return 60;
	}
}
class B15 extends A15{
	int x;
	int m1() {
		System.out.println("B m1");
		x = 70;
		return 80;
	}
}
public class DemoExecutionFlow_15 {

	public static void main(String[] args) {
		B15 b = new B15();
		A15 a = b;
		System.out.println(b.x);
		System.out.println(a.x);
	}
}