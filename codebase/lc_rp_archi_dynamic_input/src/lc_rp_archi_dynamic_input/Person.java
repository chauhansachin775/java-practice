package lc_rp_archi_dynamic_input;

public class Person {
	
	private final static int eyes 	= 2;
	private final static int ears 	= 2;
	private final static int hands 	= 2;
	private final static int legs 	= 2;
	
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
	
	// setter and getter methods 
	
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
		System.out.println(name+ " eats");
	}
	
	void sleep() {
		System.out.println(name+ " sleeps");
	}
	
}
