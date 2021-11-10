package java_programs;

class A20{
	final void m1() {
		System.out.println("hello");
	}
	void m1(int a) {
		System.out.println("hi");
	}
}

public class DemoFinal extends A20{
	
	public static void main(String[] args) {
		DemoFinal d = new DemoFinal();
		d.m1(5);
	}
}
