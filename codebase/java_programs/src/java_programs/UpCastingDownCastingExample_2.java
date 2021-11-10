package java_programs;

class Example {
	
	void m1() {
		System.out.println("inside m1 method of class Example");
	}
}

class Sample extends Example {
	
	void m2() {
		System.out.println("inside m2 method of class Sample");
	}
}

public class UpCastingDownCastingExample_2 {

	public static void main(String[] args) {
		
		Example e = new Sample();
		e.m1();
		//e.m2();
		
		Sample s = (Sample)e;
		s.m2();
		System.out.println(s instanceof Sample);
		

	}

}
