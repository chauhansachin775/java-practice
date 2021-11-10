package DemoReflectionAPI;

public class Student extends PersonDetails implements Person {
	
	private int sno;
	private String course;
	private double fee;
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public int getSno() {
		return sno;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public double getFee() {
		return fee;
	}
	
	public void eat() {
		System.out.println(getName()+ " eats non veg");
	}
	
	public void drink() {
		System.out.println(getName()+ " drinks beer");
	}
	
	public void sleep() {
		System.out.println(getName()+ " sleeps at hostel");
	}
	
	
}
