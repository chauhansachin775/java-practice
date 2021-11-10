package lc_rp_architechture_dynamic_bind_2;

public class Person {
	
	static private final int eyes 	= 2;
	static private final int ears 	= 2;
	static private final int hands 	= 2;
	static private final int legs 	= 2;
	
	private String name;
	private double height;
	private double weight;
	
	// getter methods for final variables
	
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
	
	// setter and getter methods for instance variables
	
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
	
	// local methods
	
	void eat() {
		System.out.println(name+ "eats veg");
	}
	
	void sleep() {
		System.out.println(name+ "sleeps");
	}
	
	void display() {
		System.out.println("name: "+name);
		System.out.println("height "+height);
		System.out.println("weight: "+weight);
	}
}