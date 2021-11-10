package java_programs;

class F{
	static int a = 10;
	int x = 20;
	static void m1() {
		System.out.println("A m1");
	}
	void m2() {
		System.out.println("A m2");
	}
	void m3() {
		System.out.println("A m3");
		System.out.println(a);
		System.out.println(x);
		m1();
		m2();
	}
}

class G extends F {
	static int a = 50;
	int x = 60;
	static void m1() {
		System.out.println("B m1");
	}
	void m2() {
		System.out.println("B m2");
		System.out.println(a);
		System.out.println(x);
	}
	void m4() {
		super.a = a - 10;
		super.x = x - 10;
	}
	}



class DemoExecutionFlow_1 {
	public static void main(String [] args) {
		G b1 = new G();
		G b2 = new G();
		F a1 = new F();
		
		b1.a = 15;
		b1.x = 16;
		b2.a = 18;
		b2.x = 19;
		
		b1.m4();
		b2.m4();
		b1.m3();
		System.out.println();
		b2.m3();
		System.out.println();
		System.out.println(b1.a);
		System.out.println(a1.a);
		System.out.println(b1.x);
		System.out.println(a1.x);
	}
}