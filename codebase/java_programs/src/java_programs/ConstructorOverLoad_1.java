package java_programs;
class Test_1{
	
	Test_1(){
		System.out.println("Test_1 no arg constructor");
	}
	Test_1(int a){
		System.out.println("Test_1 int arg constructor");
	}
	Test_1(String s){
		System.out.println("Test_1 String arg constructor");
	}
}

public class ConstructorOverLoad_1 extends Test_1{
	
	ConstructorOverLoad_1(){
		System.out.println("ConstructorOverLoad_1 no arg constructor");
	}
	ConstructorOverLoad_1(String s){
		super();
		System.out.println("ConstructorOverLoad_1 String arg constructor");
	}
		public static void main(String[] args) {
			ConstructorOverLoad_1 c1 = new ConstructorOverLoad_1();
			ConstructorOverLoad_1 c2 = new ConstructorOverLoad_1("Sachin");

	}

}
