package lc_rp_architechture_dynamic_bind_2;

class Student extends Person {
	
	private int	   sno;
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
		System.out.println(getName()+ " listening " +course);
	}
	
	void read() {
		System.out.println(getName()+ " reading " +course);
	}
	
	void write() {
		System.out.println(getName()+ " writing " +course);
	}
	
	void display() {
		super.display();
		System.out.println("Sno: "+sno);
		System.out.println("course: "+course);
		System.out.println("fee: "+fee);
		listen();
		read();
		write();
		
	}
}

