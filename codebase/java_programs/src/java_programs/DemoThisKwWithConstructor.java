package java_programs;

public class DemoThisKwWithConstructor {

	int x;
	int y;

	DemoThisKwWithConstructor(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(this.x);
		System.out.println(this.y);

	}

	DemoThisKwWithConstructor(String s) {
		int x = s.length();
		System.out.println(x);
	}
	
	DemoThisKwWithConstructor(boolean b) {
		System.out.println(b);
		b= true;
		System.out.println(b);
	}

	public static void main(String[] args) {

		DemoThisKwWithConstructor obj1 = new DemoThisKwWithConstructor(123, 456);
		obj1.x = 50;
		obj1.y = 60;
		System.out.println(obj1.x);
		System.out.println(obj1.y);

		DemoThisKwWithConstructor obj2 = new DemoThisKwWithConstructor("sachin");
		System.out.println(obj2.x);
		System.out.println(obj2.y);

		DemoThisKwWithConstructor obj3 = new DemoThisKwWithConstructor(false);
				
	}

}
