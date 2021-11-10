package java_programs;

class Employee_1 {
	int eId;
	String eName;
	String dept;
	int sal;
	
	void setEid(int eId) {
		this.eId= eId;
	}
	
	int getEid() {
		return eId;
	}
	
	void setEname(String eName) {
		this.eName= eName;
	}
	
	String getEname() {
		return eName;
	}
	
	void setDept(String dept) {
		this.dept= dept;
	}
	
	String getDept() {
		return dept;
	}
	
	void setSal(int sal) {
		this.sal= sal;
	}
	
	int getSal() {
		return sal;
	}
}

public class DemoGetterSetterMethod_3 {

	public static void main(String[] args) {
		
		Employee_1 e1= new Employee_1();
		e1.setEid(123);
		e1.setEname("sachin");
		e1.setDept("IT");
		e1.setSal(100000);
		
		System.out.println("eId: "+e1.getEid());
		System.out.println("eId: "+e1.getEname());
		System.out.println("eId: "+e1.getDept());
		System.out.println("eId: "+e1.getSal());
		
		System.out.println();
		
		e1.setDept("management");
		int hike= e1.getSal() * 30 / 100;
		e1.setSal(e1.getSal()+ hike);
		
		System.out.println("eId: "+e1.getEid());
		System.out.println("eId: "+e1.getEname());
		System.out.println("eId: "+e1.getDept());
		System.out.println("eId: "+e1.getSal());
		
		
	}

}
