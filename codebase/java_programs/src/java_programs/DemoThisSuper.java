package java_programs;
class A17{
	int x;
	A17(){
		x = 20;
		System.out.println("A no para");
	}
	
	A17(int a){
		this();
		System.out.println("A int para");
	}
	
	A17(String s){
		System.out.println("A String para");
	}
}

class B17 extends A17{
	
	B17(){
		this(5);
		System.out.println("B no para");
	}
	
	B17(int a){
		super(5);
		System.out.println("B int para");
	}
	
	B17(String s){
		System.out.println("B String para");
	}
}

public class DemoThisSuper {

	public static void main(String[] args) {
		
		B17 b = new B17();
		System.out.println(b.x);
	}
}
