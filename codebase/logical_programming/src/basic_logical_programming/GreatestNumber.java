package basic_logical_programming;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the first number:");
		num1= in.nextInt();
		System.out.println("Enter the second number:");
		num2= in.nextInt();
		
		if (num1>num2)
			System.out.println("Greater number:" +num1);
		else
			System.out.println("Greater number:" +num2);
		
		in.close();
	}

}
