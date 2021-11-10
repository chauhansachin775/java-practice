package java_programs;

class A12{
	void m1(Object obj) {
		System.out.println("A12 Object arg");
	}
}
class B12 extends A12{
	void m1(Object obj) {
		System.out.println("B12 Object arg");
	}
	void m1(String s) {
		System.out.println("B12 String arg");
	}
}
public class DemoExecutionFlow_12 {
	static void m1(Number num) {
		System.out.println("hello");
	}
	static void m1(Object obj) {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		B12 b = new B12();
		b.m1(50);
		b.m1("sachin");
		
		System.out.println();
		A12 a = new B12();
		a.m1("sachin");
		a.m1(50);
	}

}
