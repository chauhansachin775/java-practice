package oops_concepts;

abstract class Person {
	
	//public static int eyes = 2;
	//public static int hands = 2;
	
	public static void sleeps() {
		System.out.println("Person sleeps");
	}
	
	abstract public String uses();
	abstract public int hasAadhar();
}

class Banker extends Person {
	
	int aadhar;
	String name;
	
	Banker(int aadhar, String name) {
		this.aadhar = aadhar;
		this.name = name;
	}
	public String uses() {
		return "desktop";
	}
	
	public int hasAadhar() {
		return aadhar;
	}
}

public class DemoAbstractClass_1 {

	public static void main(String[] args) {
		
		Person p = new Banker(123456, "sachin");
		p.sleeps();
		System.out.println(p.uses());
		System.out.println(p.hasAadhar());
		
		

	}

}
