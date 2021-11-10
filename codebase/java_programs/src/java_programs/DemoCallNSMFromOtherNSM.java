package java_programs;

public class DemoCallNSMFromOtherNSM {

	int a= 20;
	int b= 30;
	
	void m1() {
		System.out.println("in non static m1");
		
	}
	
	void printxy() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		DemoCallNSMFromOtherNSM obj = new DemoCallNSMFromOtherNSM();
		obj.printxy();
		
	}

}
