package java_programs;

public class DemoThisKw_1 {

	int x= 10;
	int y= 20;
	
	void m1() {
		x= 60;
		y= 70;
	}
	public static void main(String[] args) {
		
		DemoThisKw_1 obj1= new DemoThisKw_1();
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		System.out.println();
		obj1.m1();
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);

	}

}
