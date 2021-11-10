package java_programs;

class Bank {
	
	String ifscCode= "SBIN001";
	String bankName= "SBI";
	
}

public class DemoThisKw_9 extends Bank {

	int accNo;
	int bal;
	String custName;
	
	void display() {
		
			System.out.println(accNo);
			System.out.println(custName);
			System.out.println(bal);
			System.out.println(ifscCode);
			System.out.println(bankName);
			
			System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		DemoThisKw_9 demo1 = new DemoThisKw_9();
		demo1.accNo= 123;
		demo1.bal= 50000;
		demo1.custName= "sachin";
		
		demo1.display();
		
		DemoThisKw_9 demo2 = new DemoThisKw_9();
		demo2.accNo= 456;
		demo2.bal= 90000;
		demo2.custName= "anil";
		
		demo2.display();
		
	}

}
