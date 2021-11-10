package demo_access_modifiers_package_p1;

public class Demo_1 {

	private int a = 10;
	static protected int b = 20;
	int c = 30;
	public int d = 40;

	public static void main(String[] args) {
		Demo_1 d1 = new Demo_1();
		
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);
	}

}
