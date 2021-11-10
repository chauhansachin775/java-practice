package basic_logical_programming;

import java.util.Scanner;

public class SumOfArrayElements {

	static int arraSum(int arr[]) {
		int i;
		int sum = 0;

		for (i = 0; i <= arr.length - 1; i++) {
			sum = arr[i] + sum;

		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements to want to put: ");
		int elements = in.nextInt();
		int arr[] = new int[elements];
		int i;

		for (i = 0; i < elements; i++) {
			arr[i] = in.nextInt();
		}

		int sum = arraSum(arr);

		System.out.println(sum);
		in.close();
	}

}
