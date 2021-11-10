package java_programs;

public class DemoNonstaticMethodCall {
	
	int x;
	int y;
	
	void m1(DemoNonstaticMethodCall e) {
		
		x = x+1;
		y = y+2;
		
		e.x = e.x+3;
		e.y = e.y+4;
	}

	public static void main(String[] args) {
		
		DemoNonstaticMethodCall e1 = new DemoNonstaticMethodCall();
		DemoNonstaticMethodCall e2 = new DemoNonstaticMethodCall();
		
		e1.m1(e2);
		System.out.println(e1.x+"........."+e1.y);
		System.out.println(e2.x+"........."+e2.y);
		System.out.println();
		e2.m1(e1);
		System.out.println(e1.x+"........."+e1.y);
		System.out.println(e2.x+"........."+e2.y);
		System.out.println();
		e1.m1(e1);
		System.out.println(e1.x+"........."+e1.y);
		System.out.println(e2.x+"........."+e2.y);
		System.out.println();
		e2.m1(e2);
		System.out.println(e1.x+"........."+e1.y);
		System.out.println(e2.x+"........."+e2.y);
		

	}

}
