package java_programs;

public class DemoThisKw_10 {
	
	int x= 10;
	int y= 20;
	
	void m1() {
		System.out.println("in m1 method");
	}
	
	void printXY() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
	public static void main(String[] args) {
		DemoThisKw_10 obj1= new DemoThisKw_10();
		obj1.printXY();
	}

}
