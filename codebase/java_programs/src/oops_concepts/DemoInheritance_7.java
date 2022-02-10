package oops_concepts;

class Example_7 {
	
	int x = 10;
	int y = 20;
	
	void m1() {
		System.out.println(x);
		System.out.println(y);
	}
			
}

class Sample_7 extends Example_7 {
	
	int x = 30;
	int y = 40;
	
	void m2() {
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(super.x);
		System.out.println(super.y);
	}
	
	void m3() {
		x = 50;
		y = 60;
		
		super.x = 70;
		super.y = 80;
	}
}



public class DemoInheritance_7 {

	public static void main(String[] args) {
		
		Sample_7 s1 = new Sample_7();
		Example_7 e1 = s1;
		
		Sample_7 s2 = new Sample_7();
		Example_7 e2 = s2;
		
		s1.m3();
		
		System.out.println(s1.x+"...."+s1.y);
		System.out.println(e1.x+"...."+e1.y);
		
		System.out.println(s2.x+"...."+s2.y);
		System.out.println(e2.x+"...."+e2.y);
		
		System.out.println();
		
		s1.m1();
		s2.m1();
		
		System.out.println();
		
		s1.m2();
		s2.m2();

	}

}
