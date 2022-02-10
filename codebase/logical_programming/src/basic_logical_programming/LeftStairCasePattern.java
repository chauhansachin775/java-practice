package basic_logical_programming;

import java.util.Scanner;

public class LeftStairCasePattern {

	public static void main(String[] args) {
		// Declare all varibales
	    int noOfLines;
	    // Use Scanner to accept no of lines pattern
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter no of lines for pattern you want: ");
	    noOfLines = sc.nextInt();
	    // Display left staircase pattern
	    System.out.println("Left Staircase Pattern:");
	    for(int row = 0; row < noOfLines; row++) {
	    	for(int col = 0; col < noOfLines; col++) {
	    		if(row >= col)
	    			System.out.print("#");
	    	}
	    	// Display in a new line
	    	System.out.println();
	    }
	}
}
