package java_programs;

public class ConstructorOverLoad_2 {
	int a = 20;
	
	{	
		System.out.println(a);
		a = 50;
		System.out.println("a in NSB"+a);
	}
	
	ConstructorOverLoad_2(){
		a = 90;
		System.out.println("a in constructor: "+a);
	}

	public static void main(String[] args) {
		ConstructorOverLoad_2 c = new ConstructorOverLoad_2();
		System.out.println("a in main: "+c.a);

	}
}
