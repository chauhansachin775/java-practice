package java_programs;

import java.util.Scanner;

class OnlineShopping {

	String webSite;
	int orders;
	String[] wishList = new String[4];

}

public class DemoInheritance extends OnlineShopping {

	int custID;
	String custName;
	String custAddress;

	void display() {
		System.out.println(custID);
		System.out.println(custName);
		System.out.println(custAddress);
		System.out.println(orders);
		System.out.println(webSite);
		for (String string : wishList) {
		 System.out.println(string);
		 }
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		DemoInheritance cust1 = new DemoInheritance();
		cust1.custID = 123;
		cust1.custName = "sachin";
		cust1.custAddress = "gwalior";
		cust1.orders = 10;
		cust1.webSite = "flipkart";
		int i;
		for (i = 0; i <= 3; i++) {
			cust1.wishList[i] = in.nextLine();
		}
		System.out.println();
		cust1.display();
		
		DemoInheritance cust2 = new DemoInheritance();
		cust2.custID = 456;
		cust2.custName = "anil";
		cust2.custAddress = "bhopal";
		cust2.orders = 20;
		cust2.webSite = "amazon";
		for (i = 0; i <= 3; i++) {
			cust2.wishList[i] = in.nextLine();
		}
		System.out.println();
		cust2.display();
	}

}
