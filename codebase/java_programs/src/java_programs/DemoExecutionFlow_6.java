package java_programs;

class A6{
	void m1(int a) {
		System.out.println("A6 int args");
	}
}
class B6 extends A6{
	void m1(float f) {
		System.out.println("B6 float args");
	}
	void m1(char ch) {
		System.out.println("B6 char args");
	}
}

public class DemoExecutionFlow_6 {

	public static void main(String[] args) {
		B6 b1 = new B6();
		b1.m1(50);
		b1.m1('a');
		b1.m1(50l);
		
		System.out.println();
		A6 a1 = new A6();
		a1.m1(50);
		a1.m1('a');
		//a1.m1(50l);			//error
		

	}

}
