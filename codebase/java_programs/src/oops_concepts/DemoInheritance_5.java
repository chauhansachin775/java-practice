package oops_concepts;


class Example_5 {
	
	int x = 20;
	int y = 40;
	
	
	public Example_5() {
		System.out.println("current object ref Ex: "+this);
		
	}
	
	
}
public class DemoInheritance_5 extends Example_5  {
	
	int p = 100;
	int q = 200;
	
	public DemoInheritance_5() {
		System.out.println("current object ref Demo: "+this);
		System.out.println(DemoInheritance_5.this);
	}

	public static void main(String[] args) {
		
		DemoInheritance_5 obj1 = new DemoInheritance_5();
		System.out.println(obj1);
		

	}

}
