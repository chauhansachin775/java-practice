package basic_logical_programming;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		int num;
		int i;
		int factor = 0;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the number to find the factors:");
		num = in.nextInt();
		
		System.out.printf("Factors of %d are: ", num);
		for (i = 1; i <= num; i++)
		{	if (num % i == 0)
		{ factor = num / i;
				System.out.print(+factor+ ", ");
		}
				
		}
		
	
		in.close();

	}

}
