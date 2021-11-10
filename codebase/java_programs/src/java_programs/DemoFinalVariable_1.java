package java_programs;

public class DemoFinalVariable_1 {
	static final int a = 10;
	static final int b;
	static final int c;
	
	static {
		b = 20;
	}
	static {
		c = 30;
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
