package jar_projects;

import java.util.Scanner;

public class AdditionCalculation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first digit: ");
		int a = in.nextInt();
		
		System.out.println("Enter the second digit: ");
		int b = in.nextInt();
		
		Addition.add(a,b);
		
	}

}
