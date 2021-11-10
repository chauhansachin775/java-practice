package java_programs;

class A7{
	void m1(int a) {
		System.out.println("A7 int args");
	}
	void m1(char ch) {
		System.out.println("A7 char args");
	}
}
class B7 extends A7{
	void m1(float f) {
		System.out.println("B7 float args");
	}
	void m1(char ch) {
		System.out.println("B7 char args");
	}
}
public class DemoExecutionFlow_7 {

	public static void main(String[] args) {
		B7 b = new B7();
		b.m1(50);
		b.m1('a');
		b.m1(50l);
		
		System.out.println();
		A7 a = new B7();
		a.m1(50);
		a.m1('a');
		//a.m1(50l);	//error
	}
}
