package java_programs;

class SampleMethodHiding_1 {

	int a = 10;

	static void m1() {
		System.out.println("A m1");
	}

	void m2() {
		System.out.println("A m2");
	}

	static void m3() {
		System.out.println("A m3 no parameter");
	}

	int m3(String s) {
		System.out.println("A m3 String parameter");
		return 0;
	}
}

class ExampleMethodHiding_1 extends SampleMethodHiding_1 {

	int a = 50;

	static void m1() {
		System.out.println("B m1");
	}

	void m2() {
		System.out.println("B m2");
	}

	void m3(float f, int x) {
		System.out.println("B m3 float and int parameter");
	}
}

public class DemoMethodHiding_1 {

	public static void main(String[] args) {

		ExampleMethodHiding_1 b1 = new ExampleMethodHiding_1();
		b1.m1(); 
		b1.m2(); 
		b1.m3(1.2f, 20); 
		b1.m3("sachin");
				 
		SampleMethodHiding_1 a1 = b1;
		System.out.println(a1.a);
	}
}