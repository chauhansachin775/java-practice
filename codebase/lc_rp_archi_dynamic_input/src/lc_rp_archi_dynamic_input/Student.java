package lc_rp_archi_dynamic_input;

public class Student extends Person {
	
	private int sno;
	private String course;
	private double fee;
	
	// setter and getter method
	
	void setSno(int sno) {
		this.sno = sno;
	}
	
	int getSno() {
		return this.sno;
	}
	
	void setCourse(String course) {
		this.course = course;
	}
	
	String getCourse() {
		return this.course;
	}
	
	void setFee(double fee) {
		this.fee = fee;
	}
	
	double getFee() {
		return this.fee;
	}
	
	// local methods
	
	void listen() {
		System.out.println(getName()+ " listening");
	}
	
	void write() {
		System.out.println(getName()+ " writing");
	}
	
	void read() {
		System.out.println(getName()+ " reading");
	}
	
	// display method
	
	void display() {
		System.out.println("Name: "+getName());
		
		System.out.println();
		
		System.out.println(getName()+ " has " +getEyes()+ " eyes");
		System.out.println(getName()+ " has " +getEars()+ " ears");
		System.out.println(getName()+ " has " +getHands()+ " hands");
		System.out.println(getName()+ " has " +getLegs()+ " legs");
		
		System.out.println("Height: " +getHeight());
		System.out.println("Weight: " +getWeight());
		
		System.out.println("Sno. :" +getSno());
		System.out.println("Course: " +getCourse());
		System.out.println("Fee: " +getFee());
		
		eat();
		sleep();
		
	}
}
