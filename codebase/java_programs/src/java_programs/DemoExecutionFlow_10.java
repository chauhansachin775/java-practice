package java_programs;

class A10{
	void m1(String s) {
		System.out.println("A10 String arg");
	}
}
class B10 extends A10{
	void m1(Object obj) {
		System.out.println("B10 Object arg");
	}
}
public class DemoExecutionFlow_10 {

	public static void main(String[] args) {
		B10 b = new B10();
		b.m1("Sachin");
		b.m1(10);
		
		System.out.println();
		A10 a = new B10();
		a.m1("Sachin");
		a.m1(10);  		//error
	}

}
