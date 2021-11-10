package DemoReflectionAPI;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		College c1 = new College();
		
		System.out.println("--- welcome to college info system---");
		System.out.println();
		
		System.out.println("do you want to enter Faclulty OR Student info ? Faculty/Student");
		String cnf = in.nextLine();
		c1.objectCnf(cnf);
		
		
		

	}

}
