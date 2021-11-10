package java_programs;

public class DemoThisKw_4 {

	int x = 10;
	int y = 20;

	void m1(DemoThisKw_4 obj) {

		x = 50;
		y = 60;

		obj.x = 123;
		obj.y = 456;
	}

	public static void main(String[] args) {

		DemoThisKw_4 obj1 = new DemoThisKw_4();
		DemoThisKw_4 obj2 = new DemoThisKw_4();

		obj1.m1(obj2);

		System.out.println(obj1.x);
		System.out.println(obj1.y);

		System.out.println();

		System.out.println(obj2.x);
		System.out.println(obj2.y);

		System.out.println();

		obj2.m1(obj1);

		System.out.println(obj1.x);
		System.out.println(obj1.y);

		System.out.println();

		System.out.println(obj2.x);
		System.out.println(obj2.y);

	}

}
