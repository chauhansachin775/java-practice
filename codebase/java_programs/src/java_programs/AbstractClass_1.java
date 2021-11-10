package java_programs;

public abstract class AbstractClass_1 {

	static int x = 10;
	int y = 50;
	
	static {
		System.out.println("in SB");
	}
	
	{
		System.out.println("in NSB");
	}
	
	AbstractClass_1() {
		System.out.println(" constructor executed");
	}
	
	static void m1() {
		System.out.println("in static m1");
	}
	
	void m2() {
		System.out.println("in non static m2");
	}
	
	public static void main(String[] args) {
		
		System.out.println("in main method");
		System.out.println(x);
		m1();
		AbstractClass_1 a = new AbstractClass_1();
		
		
	}
}