package com.demo.collections.ArrayList;

import java.util.ArrayList;

public class DemoArrayList_6 {

	public static void main(String[] args) {
		// searching bank account object by account number and branch
		
		ArrayList<BankAccount> al = new ArrayList<BankAccount>();
		
		al.add(new BankAccount(101, "sachin", "SBI", 1000));
		al.add(new BankAccount(102, "anil", "CITY", 5000));
		
		BankAccount ba = new BankAccount(102, "aman", "CITY", 3000);
		System.out.println(al.contains(ba));
		
	}

}


class BankAccount {
	
	long accNo;
	String accHolderName;
	String branch;
	double bal;
	
	public BankAccount(long accNo, String accHolderName, String branch, double bal) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.branch = branch;
		this.bal = bal;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount) {
			BankAccount ba = (BankAccount)obj;
			return ((this.accNo == ba.accNo) && (this.branch.equalsIgnoreCase(ba.branch)));
		}
		return false;
	}
	
	
}