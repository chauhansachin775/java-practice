package java_programs;

import java.util.Scanner;

public class DemoFinalVariable_3 {
	
	final int x = 10;
	final int y;
	final int z;
	
	{
		System.out.println("NSB starts");
		Scanner in = new Scanner(System.in);
		System.out.println("enter the vale of y:");
		y = in.nextInt();
		System.out.println("NSB ends");
	}
	
	DemoFinalVariable_3(){
		z = 30;
		System.out.println("in no para constructor");
	}
	
	DemoFinalVariable_3(int z){
		this.z = z;
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		DemoFinalVariable_3 d = new DemoFinalVariable_3();
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
		
		DemoFinalVariable_3 d2 = new DemoFinalVariable_3(180);
		System.out.println(d2.x);
		System.out.println(d2.y);
		System.out.println(d2.z);
	}

}
