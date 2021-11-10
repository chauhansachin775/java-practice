package java_programs;

public class EmployeeCompany {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.empId = 100;
		e1.empName = "Sachin";
		e1.empSal = 80000;

		Employee e2 = new Employee();

		e2.empId = 200;
		e2.empName = "Anil";
		e2.empSal = 90000;

		System.out.println("First employee Info:\n");
		System.out.println("e1.empId: \t: " + e1.empId);
		System.out.println("e1.empName: \t: " + e1.empName);
		System.out.println("e1.empSal: \t: " + e1.empSal);
			
		System.out.println();
		
		System.out.println("Second employee Info:\n");
		System.out.println("e2.empId: \t: " + e2.empId);
		System.out.println("e2.empName: \t: " + e2.empName);
		System.out.println("e2.empSal: \t: " + e2.empSal);

	}

}
