package lc_rp_architechture_dynamic_bind_2;

class Faculty extends Person{
	
	private int fno;
	private String dept;
	private double sal;
	
	// setter and getter method
	
	void setFno(int fno) {
		this.fno = fno;
	}
	
	int getFno() {
		return this.fno;
	}
	
	void setDept(String dept) {
		this.dept = dept;
	}
	
	String getDept() {
		return this.dept;
	}
	
	void setSal(double sal) {
		this.sal = sal;
	}
	
	double getSal() {
		return this.sal;
	}
	
	void eat() {
		super.eat();
		System.out.println(getName()+ " eats non veg");
	}
	
	void sleep() {
		System.out.println(getName()+ " don't sleep");
	}
	
	void display() {
		super.display();
		System.out.println("Fno: "+fno);
		System.out.println("department: "+dept);
		System.out.println("salary: "+sal);
		eat();
		sleep();
		}
}
