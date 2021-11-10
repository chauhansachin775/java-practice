package basic_logical_programming;

import java.util.Scanner;

public class SecondToHrMmSs_conversion {
	
	static void secToHrMmSs_conversion(int sec) {
		int hr = sec / 3600;
		int mm = (sec % 3600) / 60;
		int ss = ((sec % 3600) / 60) % 60;
		
		System.out.println("HH:MM:SS \t"+hr+ ":"+mm+":"+ss);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter seconds: ");
		int sec = in.nextInt();
		secToHrMmSs_conversion(sec);
			
		in.close();
	}

}
