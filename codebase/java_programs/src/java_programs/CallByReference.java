package java_programs;

public class CallByReference {
	
	int x= 10;
	int y= 20;
	
	void m1(int q) {
		q= 50;	
	}
	
	void m2(CallByReference ref) {
		ref= new CallByReference();
		System.out.println(ref);
		System.out.println(this);
	}
	
	void m3(CallByReference ref) {	
	}
	
	public static void main(String[] args) {
		
		CallByReference obj1= new CallByReference();
		int p= 10;
		obj1.m1(p);
		System.out.println("p= "+p);
		
		obj1.m2(obj1);
		System.out.println(obj1);
	}

}
