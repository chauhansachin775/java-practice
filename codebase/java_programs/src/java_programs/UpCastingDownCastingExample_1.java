package java_programs;

class A1 extends java.lang.Object{
	
}

class B1 extends A1{
	
}

class C1 extends B1{
	
}

class D1 extends java.lang.Object{
	
}

public class UpCastingDownCastingExample_1 {

	public static void main(String[] args) {
		
		/*A1 a = new C1();
		System.out.println(a instanceof Object);
		System.out.println(a instanceof A1);
		System.out.println(a instanceof B1);
		System.out.println(a instanceof C1);
		//System.out.println(a instanceof D1);
		System.out.println();
		
		Object obj = new B1();
		//D1 d = (D1)obj;           //here it is showing error;
		System.out.println(a instanceof Object);
		System.out.println(a instanceof A1);
		System.out.println(a instanceof B1);
		System.out.println(a instanceof C1);
		System.out.println(obj instanceof D1); // now it showing no error
		*/
		
		//A1 a = new C1();
		//B1 b = (B1)a;
		
		/*Object obj1 = new B1();
		System.out.println(obj1 instanceof Object);
		System.out.println(obj1 instanceof A1);
		System.out.println(obj1 instanceof B1);
		System.out.println(obj1 instanceof C1);
		System.out.println(obj1 instanceof D1);
		System.out.println(new B1() instanceof D1);
		 */
		int i = 10;
		float f1 = (float)20.0;
		
		float f2 = i+f1;
		int i2 = i + (int)f1;
		
		byte b1 = 50;
		byte b2 = 1;
		byte b3 = 126+1;
		//byte b4 = 126+2;
		byte b5 = (int)10L+20;
		//byte b3 = b1 + b2;
		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = (char)(ch1 + ch2);
		System.out.println(b3);
		
		int a = 50;
		int b = 50;
		System.out.println(a=b);
		//System.out.println(a=b==b);
		System.out.println((a=b)==b);
		
		System.out.println(8.0f==8.0);
		
		
	}

}
