package java_programs;

class A18 {

	A18() {
		this(10);
		System.out.println("A no para");
	}

	A18(int a) {
		this("sachin");
		System.out.println("A int patra");
	}

	A18(String s) {
		System.out.println("A String para");
	}
}

class B18 extends A18 {

	B18() {
		this(20);
		System.out.println("B no para");
	}

	B18(int a) {
		this("sachin");
		System.out.println("B int para");
	}

	B18(String s) {
		System.out.println("B String para");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {

		B18 b = new B18();
	}
}