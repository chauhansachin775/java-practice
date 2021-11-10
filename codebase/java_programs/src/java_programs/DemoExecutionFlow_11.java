package java_programs;

class A11{
	void m1(String s) {
		System.out.println("A11 String args");
	}
	void m1(Integer io) {
		System.out.println("A11 Integer arg");
	}
}
class B11 extends A11{
	void m1(Object obj) {
		System.out.println("B11 Object arg");
	}
	void m1(String s) {
		System.out.println("B11 String arg");
	}
	void m1(Integer io) {
		System.out.println("B11 Integer arg");
	}
}
public class DemoExecutionFlow_11 {

	public static void main(String[] args) {
		B11 b = new B11();
		b.m1("sachin");
		b.m1(10);
		
		
		System.out.println();
		A11 a = new B11();
		a.m1("sachin");
		a.m1(10);

	}

}
