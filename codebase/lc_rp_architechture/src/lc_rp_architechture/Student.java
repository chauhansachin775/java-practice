package lc_rp_architechture;

public class Student extends Person {
	
	private int sno;
	private String course;
	private double fee;
	
	
	// setter and getter methods
	
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
	
	//normal methods
	
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
		System.out.println(getName()+ " has "+getEyes()+ " eyes");
		System.out.println(getName()+ " has "+getEars()+ " ears");
		System.out.println(getName()+ " has "+getHands()+ " hands");
		System.out.println(getName()+ " has "+getLegs()+ " legs");
		
		System.out.println("Weight: " +getWeight());
		System.out.println("Height: " +getHeight());
		
		System.out.println("Sno: " +sno);
		System.out.println("Course: " +course);
		System.out.println("Fee: " +fee);
	}
	
}
