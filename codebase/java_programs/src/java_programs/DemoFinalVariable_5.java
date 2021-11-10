package java_programs;

public class DemoFinalVariable_5 {

	static final int a;

	static {
		System.out.println(DemoFinalVariable_5.a);
	}

	static {
		a = 50;
		System.out.println(DemoFinalVariable_5.a);
	}

	public static void main(String[] args) {
		// System.out.println(DemoFinalVariable_5.a);
	}
}