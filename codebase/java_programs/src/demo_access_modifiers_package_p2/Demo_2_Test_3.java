package demo_access_modifiers_package_p2;
import demo_access_modifiers_package_p1.*;

public class Demo_2_Test_3 extends Demo_2 {

	public static void main(String[] args) {
		Demo_2 d1 = new Demo_2();
		
		System.out.println(d1.rollNo);
		//System.out.println(d1.name);
		//System.out.println(d1.salary);
		//System.out.println(d1.nature);
		
		Demo_2_Test_3 dt = new Demo_2_Test_3();
		System.out.println(dt.rollNo);
		//System.out.println(dt.name);
		System.out.println(dt.salary);
		//System.out.println(dt.nature);
		

	}

}
