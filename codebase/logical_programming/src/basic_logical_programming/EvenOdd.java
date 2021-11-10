package basic_logical_programming;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		int n;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number to check for even OR odd:");
		n = in.nextInt();

		if (n % 2 == 0) {
			System.out.println("It's an even number");
		} else {
			System.out.println("It's an odd number");
		}
			in.close();
	}

}
