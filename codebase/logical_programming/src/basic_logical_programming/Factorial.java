package basic_logical_programming;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int num;
		//int i;
		long factorial = 1;
		Scanner in = new Scanner(System.in);
				
		System.out.println("Enter the number to find it's factorial:");
		num = in.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			factorial = factorial * i;
		}
			System.out.printf("Factorial of %d is:%d",num, factorial );
			
			in.close();
	}

}
