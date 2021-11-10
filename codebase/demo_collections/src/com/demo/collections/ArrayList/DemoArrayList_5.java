package com.demo.collections.ArrayList;

import java.util.ArrayList;

public class DemoArrayList_5 {

	public static void main(String[] args) {
		// searing employee class object with reference and data.

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "sachin", 1000));
		al.add(new Employee(102, "anil", 2000));
		al.add(new Employee(103, "aman", 3000));

		Employee e1 = new Employee(104, "anuj", 4000);
		al.add(e1);
		System.out.println(al.contains(new Employee(104, "anuj", 4000)));

	}
}

class Employee {

	int empNo;
	String empName;
	double sal;

	Employee(int empNo, String empName, double sal) {
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
	}

	public boolean equals(Object obj) { 
		if(obj instanceof Employee) { 
			Employee e = (Employee)obj;
			return ((this.empNo == e.empNo) && 
					(this.empName == e.empName) && 
					(this.sal == e.sal));
			}
				  return false;
	  
		}
}