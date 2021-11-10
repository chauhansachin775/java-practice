package lc_rp_archi_dynamic_input;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("----welcome to student bio system----");
		System.out.println();

		int i = 0;
		boolean bool = true;
		Student arr[] = new Student [10];

		while (bool) {
			System.out.println("do you want to enter a new studen bio ? Y/N: ");
			char ch = in.nextLine().charAt(0);
			if (ch == 'Y' || ch == 'y') {

				 arr[i] = new Student();

				System.out.println("enter name of the student: ");
				String name = in.nextLine();
				arr[i].setName(name);

				System.out.println("enter height: ");
				double height = in.nextDouble();
				arr[i].setHeight(height);

				System.out.println("enter weight: ");
				double weight = in.nextDouble();
				arr[i].setWeight(weight);

				System.out.println("enter student number: ");
				int sno = in.nextInt();
				arr[i].setSno(sno);

				System.out.println("enter fee: ");
				double fee = in.nextDouble();
				arr[i].setFee(fee);

				in.nextLine();

				System.out.println("enter course: ");
				String course = in.nextLine();
				arr[i].setCourse(course);
				i++;
				System.out.println();
				} else if (ch == 'N' || ch == 'n') {
					int j;
					for (j = 0; j < i; j++) {
						System.out.println();
					arr[j].display();
					System.out.println();
					}
				System.out.println("Thank You !! Visit next time.");
				break;
				} else {
					System.out.println("you have entered wrong option.");
				
				}
		}
	}
}
