package java_programs;

public class DemoStaticMemberFlowOfExe_Example_3 {
	
	static int x;
	
	static {
		System.out.println("x="+x);
		System.out.println("y="+getY());
	}

	public static void main(String[] args) {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	
	static int getY() {
		return y;
	}
	
	static int y = 20;

}
