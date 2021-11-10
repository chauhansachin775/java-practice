package oops_concepts;


class SampleSuper_1 {
	int x = 10;
	int y = 20;
	
	void m1() {
		System.out.println(x);
		System.out.println(y);
	}
}
	
class ExampleSuper_1 extends SampleSuper_1{
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
	


public class DemoSuperKw_1 {

	public static void main(String[] args) {
		
		ExampleSuper_1 es1  = new ExampleSuper_1();
		SampleSuper_1 ss1 = es1;
		
		ExampleSuper_1 es2 = new ExampleSuper_1();
		SampleSuper_1 ss2 = es2;
		
		es1.m3();
		
		System.out.println(es1.x+"...."+es1.y);
		System.out.println(ss1.x+"...."+ss1.y);
		
		System.out.println(es2.x+"...."+es2.y);
		System.out.println(ss2.x+"...."+ss2.y);
		
		System.out.println();
		
		es1.m1();
		es2.m1();
		
		System.out.println();
		
		es1.m2();
		es2.m2();
		
	}

}
