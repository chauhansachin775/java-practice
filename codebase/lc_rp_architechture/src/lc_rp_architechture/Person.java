package lc_rp_architechture;

public class Person {
	
	private static final int eyes 	= 2;
	private static final int ears 	= 2;
	private static final int hands 	= 2;
	private static final int legs 	= 2;

	
	private String name;
	private double height;
	private double weight;
	
	//getter methods for final variables
	
	int getEyes() {
		return eyes;
	}
	
	int getEars() {
		return ears;
	}
	
	int getHands() {
		return hands;
	}
	
	int getLegs() {
		return legs;
	}
	
	
	// setter and getter 
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	double getHeight() {
		return this.height;
	}
	
	void setWeight(double weight) {
		this.weight = weight;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	
	//nornal methods
	
	public void eat() {
		System.out.println(this.name+ " eating");
	}
	
	public void sleep() {
		System.out.println(this.name+ " sleeping");
	}
	
}
