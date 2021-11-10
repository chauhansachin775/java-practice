package DemoReflectionAPI;

public class Faculty extends PersonDetails {

	private int fno;
	private String dept;
	private double sal;
	
	public void setFno(int fno) {
		this.fno = fno;
	}
	
	public int getFno() {
		return fno;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public double getSal() {
		return sal;
	}
	
	public void eat() {
		System.out.println(getName()+ " eats veg");
	}
	
	public void drink() {
		System.out.println(getName()+ " drinks water");
	}
	
	public void sleep() {
		System.out.println(getName()+ " sleeps at home");
	}
	
	
	
}
