package demo_access_modifiers_package_p2;
import demo_access_modifiers_package_p1.*;

class Test_2 extends Demo_1 {

	public static void main(String[] args) {
		Demo_1 d2=new Demo_1();
		Test_2 t2= new Test_2();
		
		System.out.println(t2.b);
		//System.out.println(t2.d);
		System.out.println();
		//System.out.println(d2.d);
		System.out.println(d2.b);

	}

}
