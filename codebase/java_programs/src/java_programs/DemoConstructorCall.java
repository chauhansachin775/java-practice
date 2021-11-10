package java_programs;

public class DemoConstructorCall {

	int a;

	DemoConstructorCall() {
		System.out.println("in constructor");
		int b = 50;
		System.out.println(b);

	}

	DemoConstructorCall(int a) {
		this();
		int x = a + 20; 
		 //int y = b = 30;
		 
		  System.out.println(x);
		
	}

	public static void main(String[] args) {

		//DemoConstructorCall obj = new DemoConstructorCall();
		//System.out.println(obj.a);
		DemoConstructorCall obj2=new DemoConstructorCall(10);
		System.out.println(obj2.a);

	}

}
