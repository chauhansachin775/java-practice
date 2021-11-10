package java_programs;

public class DemoThisKw_2 {

	int x = 10;
	int y = 20;

	void m1(int x, int y) {
		x = x;
		y = y;

	}

	void m2(int a, int b) {
		x = a;
		y = b;
	}

	void m3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {

		DemoThisKw_2 obj1 = new DemoThisKw_2();

		System.out.println("obj1.x: " + obj1.x);
		System.out.println("obj1.y: " + obj1.y);

		obj1.m1(60, 70);

		System.out.println();

		System.out.println("obj1.x: " + obj1.x);
		System.out.println("obj1.y: " + obj1.y);

		obj1.m2(100, 120);

		System.out.println("obj1.x: " + obj1.x);
		System.out.println("obj1.y: " + obj1.y);

		obj1.m3(600, 700);

		System.out.println("obj1.x: " + obj1.x);
		System.out.println("obj1.y: " + obj1.y);

	}

}
