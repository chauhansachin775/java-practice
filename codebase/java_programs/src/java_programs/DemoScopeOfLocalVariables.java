package java_programs;

public class DemoScopeOfLocalVariables {
	
	static void m1(int p) {
		int q = 40;
		
		if(p==20) {
			int r = 100;
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
		}
		System.out.println(p);
		System.out.println(q);
		//System.out.println(r);
	}

	public static void main(String[] args) {
		m1(10);
		m1(20);

	}

}
