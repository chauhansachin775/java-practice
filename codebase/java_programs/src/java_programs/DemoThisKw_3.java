package java_programs;

public class DemoThisKw_3 {

	int x = 10;
	int y = 20;

	void m1() {
		x = 50;
		y = 60;
		System.out.println(this.x);
		System.out.println(this.y);

		System.out.println();

		DemoThisKw_3 obj1 = new DemoThisKw_3();
		obj1.x = 600;
		obj1.y = 800;

		x= 123;
		y= 456;
		
		System.out.println("obj1.x of m1: " + obj1.x);
		System.out.println("obj1.y of m1: " + obj1.y);

		System.out.println();

	}

	public static void main(String[] args) {

		DemoThisKw_3 obj1 = new DemoThisKw_3();

		obj1.m1();
		System.out.println(obj1.x);
		System.out.println(obj1.y);

	}

}
