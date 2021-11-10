package java_programs;

abstract class A21 {
	
	static int a = 10;
	int x = 50;
	
	abstract void m5();
	
	static {
		System.out.println("in A21 SB");
	}
	
	{
		System.out.println("in A21 NSB");
	}
	
	A21() {
		System.out.println("A21 constructor executed");
	}
	
	static void m1() {
		System.out.println("in A21 static method m1");
	}
	
	void m2() {
		System.out.println("in A21 non static method m2");
	}
	
	
}

public class AbstractClass_2 extends A21 {

	static int b = 20;
	int y = 60;
	
	static {
		System.out.println("in AbstractClass_2 static block");
	}
	
	{
		System.out.println("in AbstractClass_2 non static block");
	}
	
	AbstractClass_2() {
		System.out.println("AbstractClass_2 constructor executed");
	}
	
	static void m3() {
		System.out.println("in AbstractClass_2 static method m3");
	}
	
	void m4() {
		System.out.println("in AbstractClass_2 non static method m4");
	}
	
	void m5() {
		System.out.println("abstract method of A21 executing fron child class");
	}
	
	public static void main(String[] args) {
	
		System.out.println("in AbstractClass_2 main method");
		m1();
		m3();
		
		AbstractClass_2 a = new AbstractClass_2();
		a.m2();
		a.m4();
		System.out.println(a.a);
		System.out.println(a.x);
		System.out.println(a.b);
		System.out.println(a.y);
		
	}

}
