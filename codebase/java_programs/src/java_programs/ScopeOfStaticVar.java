package java_programs;

class Test {

	static int a = 10;

	static void m1() {
		a = 50;

	}

	static void m2() {
		System.out.println(a);
	}
}

class ScopeOfStaticVar {

	public static void main(String[] args) {

		System.out.println(Test.a);
		Test.m2();

		Test.m1();
		Test.m2();
		System.out.println(Test.a);
	}
}