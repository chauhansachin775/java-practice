package java_programs;

public class DemoStaticInstanceVar_2 {

	static int i1 = 10;
	String s1;

	public static void main(String[] args) {

		DemoStaticInstanceVar_2 obj1 = new DemoStaticInstanceVar_2();
		DemoStaticInstanceVar_2 obj2 = new DemoStaticInstanceVar_2();
		DemoStaticInstanceVar_2 obj3 = new DemoStaticInstanceVar_2();

		obj1.s1 = "sachin";
		obj2.s1 = "anil";
		obj3.s1 = "aman";

		System.out.println(+i1 + " " + obj1.s1);
		System.out.println(+i1 + " " + obj2.s1);
		System.out.println(+i1 + " " + obj3.s1);
		
	}

}
