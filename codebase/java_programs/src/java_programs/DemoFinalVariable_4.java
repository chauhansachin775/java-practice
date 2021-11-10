package java_programs;

public class DemoFinalVariable_4 {

	static void m1(final int p) {
		final int q = 20;
		final int r;
		r = 30;
		
		final int s;
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);  //error because we are using s withoiut initializing.
	}
	public static void main(String[] args) {
		m1(140);
	}
}
