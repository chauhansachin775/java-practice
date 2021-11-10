package basic_logical_programming;

import java.util.Scanner;

public class PrintEvenNumber {

	public static void main(String[] args) {

		int n;
		int i;
		int even = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("enter the dead end for even number:");
		n = in.nextInt();
		System.out.printf("The first %d even numbers are:", n);

		for (i = 1; i <= n; i++) {
			even = even + 2;
			System.out.print(+even + ",");
		}
			in.close();
	}

}
