package java_programs;

public class DemoStaticInstanceVar_3 {

	static int i1 = 10;
	String s1;

	public static void main(String[] args) {

		//	i1 = 125;
		DemoStaticInstanceVar_3 obj1 = new DemoStaticInstanceVar_3();
		DemoStaticInstanceVar_3 obj2 = new DemoStaticInstanceVar_3();
		DemoStaticInstanceVar_3 obj3 = new DemoStaticInstanceVar_3();

		//obj2.i1 = 60;

		obj1.s1 = "Rahul";
		obj2.s1 = "Anuj";
		obj3.s1 = "Ajay";

		System.out.println(+obj1.i1 + " " + obj1.s1);
		System.out.println(+obj2.i1 + " " + obj2.s1);
		System.out.println(+obj3.i1 + " " + obj3.s1);
		
	}

}
