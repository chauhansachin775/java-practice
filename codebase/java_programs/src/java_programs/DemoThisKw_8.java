package java_programs;

public class DemoThisKw_8 {

	int x = 10;
	int y = 30;

	void m1() {
		DemoThisKw_8 obj2 = new DemoThisKw_8();

		x = 50;
		y = 70;

		System.out.println(obj2.x+"hello");
		System.out.println(obj2.y+"hello");

		System.out.println();

	}

	public static void main(String[] args) {

		DemoThisKw_8 obj1 = new DemoThisKw_8();
		obj1.m1();

		System.out.println(obj1.x);
		System.out.println(obj1.y);
	}

}
