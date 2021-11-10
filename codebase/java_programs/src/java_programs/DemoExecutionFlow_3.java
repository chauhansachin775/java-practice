package java_programs;

class Example_2 {

}

class Sample_2 extends Example_2 {

}

class Sample_3 extends Example_2 {

}

public class DemoExecutionFlow_3 {

	void m1(Example_2 e1) {
		System.out.println("example args");
	}

	void m1(Sample_2 s2) {
		System.out.println("sample_2 args");
	}

	void m1(Sample_3 s3) {
		System.out.println("sample_3 args");
	}

	public static void main(String[] args) {
		DemoExecutionFlow_3 d1 = new DemoExecutionFlow_3();
		d1.m1((Sample_2)null);
		d1.m1((Example_2)null);
		d1.m1((Sample_3)null);

	}

}
