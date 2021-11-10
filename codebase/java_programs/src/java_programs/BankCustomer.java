package java_programs;

public class BankCustomer {

	public static void main(String[] args) {
		
		BankDetails cust1 = new BankDetails();
		
		cust1.accNum 	= 123456L;
		cust1.accName	= "Akash";
		cust1.bal		= 45000;
		
		BankDetails cust2 = new BankDetails();
		
		cust2.accNum	= 789456L;
		cust2.accName	= "Anurag";
		cust2.bal		= 50000;
		
		System.out.println("First customer details: \n");
		
		System.out.println("cust1.accNum \t:" +cust1.accNum);
		System.out.println("cust1.accName \t:"+cust1.accName);
		System.out.println("cust1.bal \t:" +cust1.bal);
		
		System.out.println();
		
		System.out.println("Second customer details: \n");
		
		System.out.println("cust2.accNum \t:" +cust2.accNum);
		System.out.println("cust2.accName \t:"+cust2.accName);
		System.out.println("cust2.bal \t:" +cust2.bal);
	}

}
