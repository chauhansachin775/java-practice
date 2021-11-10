package java_programs;

public class DemoFinalVariable_2 {
	final int p;
	final int q;
	
	DemoFinalVariable_2(){
		this(5);
		p = 10;
	}
	DemoFinalVariable_2(int x){
		q = 20;
	}
	DemoFinalVariable_2(String x){
		p = 30;
		q = 40;
	}
	
	public static void main(String[] args) {
		DemoFinalVariable_2 d = new DemoFinalVariable_2();

	}

}
