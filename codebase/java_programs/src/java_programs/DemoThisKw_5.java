package java_programs;

public class DemoThisKw_5 {

	int x;
	int y;

	static void m1(DemoThisKw_5 obj) {

		obj.x = 80;
		obj.y = 90;

	}
	
	DemoThisKw_5(int x,int y) {
		this.x = x;
		this.y = y;

	}

	DemoThisKw_5(DemoThisKw_5 obj) {
		this.x = obj.x;
		this.y = obj.y;

	}

	public static void main(String[] args) {

		DemoThisKw_5 obj1 = new DemoThisKw_5(10,20);
		DemoThisKw_5 obj2 = new DemoThisKw_5(obj1);

		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		

		System.out.println(obj1.x);
		System.out.println(obj1.y);
		DemoThisKw_5.m1(obj1);

		System.out.println(obj1.x);
		System.out.println(obj1.y);

	}
}
