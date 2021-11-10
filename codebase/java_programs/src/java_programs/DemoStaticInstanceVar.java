package java_programs;

public class DemoStaticInstanceVar {

	static int i1 = 10;
	String s1;

	public static void main(String[] args) {

		DemoStaticInstanceVar obj1 = new DemoStaticInstanceVar();
		DemoStaticInstanceVar obj2 = new DemoStaticInstanceVar();
		DemoStaticInstanceVar obj3 = new DemoStaticInstanceVar();

		obj1.s1 = "sachin";
		obj2.s1 = "anil";
		obj3.s1 = "aman";
		System.out.println(i1);
		System.out.println(+DemoStaticInstanceVar.i1 + " " + obj1.s1);
		System.out.println(+DemoStaticInstanceVar.i1 + " " + obj2.s1);
		System.out.println(+DemoStaticInstanceVar.i1 + " " + obj3.s1);
	}
}
