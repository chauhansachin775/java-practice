package java_programs;
class A9{
	void m1(Object obj) {
		System.out.println("A9 Object arg");
	}
}
class B9 extends A9{
	void m1(String S) {
		System.out.println("B9 String args");
	}
}

public class DemoExecutionFlow_9 {

	public static void main(String[] args) {
		B9 b = new B9();
		b.m1("Sachin");
		b.m1(50);
		
		System.out.println();
		A9 a = new A9();
		a.m1("sachin");
		a.m1(10);

	}

}
