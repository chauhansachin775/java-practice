package oops_concepts;

class P1 {
	
	P1(){
		System.out.println("in class Exp const this:"+this);
	}
	
}

class Q1 extends P1{
	
	Q1() {
		System.out.println("in class Q1 const this:"+this);
	}
}

public class Experiments {
	
	public static void main(String[] args) {
		
		Q1 obj = new Q1();
		System.out.println("in main b1:"+obj);
	}

}
