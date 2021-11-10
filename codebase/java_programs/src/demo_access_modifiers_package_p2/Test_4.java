package demo_access_modifiers_package_p2;

import demo_access_modifiers_package_p1.Demo_4;

public class Test_4 {
	
	static int m1() {
		return 'a';
	}
	public static void main(String[] args) {
		System.out.println(Demo_4.x);
		System.out.println(Demo_4.y);
		//int a = m1();
		//char ch;
		
		System.out.println((char) m1());
	}
}
