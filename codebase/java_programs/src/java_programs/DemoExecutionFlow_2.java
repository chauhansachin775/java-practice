package java_programs;

class Example_1 {

}

class Sample_1 extends Example_1 {

}

public class DemoExecutionFlow_2 {

	void m1(Example_1 e1) {
		System.out.println("example args");
	}

	void m1(Sample_1 s1) {
		System.out.println("sample args");
	}

	public static void main(String[] args) {
		DemoExecutionFlow_2 d1 = new DemoExecutionFlow_2();

		d1.m1(new Example_1());
		d1.m1(new Sample_1());
		d1.m1(null);

		Example_1 e1 = new Example_1();
		d1.m1(e1);
		Sample_1 s1 = new Sample_1();
		d1.m1(s1);
		Example_1 e2 = new Sample_1();
		d1.m1(e2);
		Example_1 e3 = null;

		Sample_1 s3 = null;
		d1.m1(s3);
		d1.m1(null);
	}

}
