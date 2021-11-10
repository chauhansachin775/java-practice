package basic_logical_programming;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float p;
		float r;
		float t;
		float si;
		
	Scanner in = new Scanner (System.in);
	
		System.out.print("Enter the principal amount: ");
		p = in.nextFloat();
		
			System.out.print("Enter the rate: ");
			r = in.nextFloat();
		
				System.out.print("Enter the time: ");
				t = in.nextFloat();
				
					si = (p * r * t) /100 ;
					
					System.out.println("Simple Interest: " +si);
					in.close();
	}

}
