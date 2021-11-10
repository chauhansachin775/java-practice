package lc_rp_architechture_dynamic_bind_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("--- welcome to College Info System ---");
		System.out.println();

		// Student[] stdArr = new Student[10];
		// Faculty[] facltArr = new Faculty[10];

		int i = 0;
		int j = 0;
		int count = 0;

		College c1 = new College();

		while (i < 10 || j < 10) {
			System.out.println("do you want to enter new STUDENT OR FACULTY info ? press Y/N");
			char ch = in.next().charAt(0);
			System.out.println();
			if (ch == 'Y' || ch == 'y') {
				System.out.println("STUDENT or FACULTY ? Press S/F");
				char cnf = in.next().charAt(0);
				if (cnf == 'S' || cnf == 's') {
					if (i < 9) {
						c1.info(new Student());
					} else {
						System.out.println("you can not enter more than 10 students info.");
						break;
						}
					i++;
				}else if (cnf == 'f' || cnf == 'F') {
					if (j < 9) {
						// facltArr[j] = new Faculty();
						//College c1 = new College();
						c1.info(new Faculty());
						
					} else {
						System.out.println("you can not enter more than 10 faculties info.");
						break;
					}
				j++;
				}
			}else if(ch == 'n' || ch == 'N') {
				int k,l;
				for(k = 0; k<i;k++) {
					c1.stdArr[k].display();
					System.out.println();
				}
				for(l=0;l<j;l++) {
					c1.facltArr[l].display();
					System.out.println();
				}
			}
		}
	}
}