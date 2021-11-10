package java_programs;

public class DemoThisKw_11 {

	static int a = 10;
	int b = 20;

	void m1() {
		System.out.println(DemoThisKw_11.a);
		System.out.println(this.b);
	}

	public static void main(String[] args) {
		DemoThisKw_11 obj = new DemoThisKw_11();
		obj.m1();
	}
}
