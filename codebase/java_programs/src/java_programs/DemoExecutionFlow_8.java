package java_programs;

class A8{
	void m1(float f) {
		System.out.println("A8 float args");
	}
}
class B8 extends A8{
	void m1(int a) {
		System.out.println("B8 int args");
	}
	void m1(long l) {
		System.out.println("B8 long args");
	}
	void m1(float f) {
		System.out.println("B8 float args");
	}
}
public class DemoExecutionFlow_8 {

	public static void main(String[] args) {
		B8 b = new B8();
		b.m1(50);
		b.m1('a');
		b.m1(50l);
		
		System.out.println();
		A8 a = new B8();
		a.m1(50);
		a.m1('a');
		a.m1(50l);
	}
}