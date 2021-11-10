package com.demo.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add("ram");
		al.add(true);
		al.add(99.9);
		al.add("mango");
		al.add(new Employee_1(4004, "sachin", "IT", 5000));
		
		System.out.println(al);
		
		Iterator<Object> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(al.contains(new Employee_1(4004, "sachin", "IT", 50000)));
	}

}

class Employee_1 {
	
	int empNum;
	String empName;
	String dept;
	double sal;
	
	public Employee_1(int empNum, String empName, String dept, double sal) {
		this.empNum = empNum;
		this.empName = empName;
		this.dept = dept;
		this.sal = sal;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		else if(obj instanceof Employee_1) {
			Employee_1 e = (Employee_1)obj;
			return (this.empNum == e.empNum) && (this.empName == e.empName)
					&& (this.dept == e.dept) && (this.sal == e.sal);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [empNum=" + empNum + ", empName=" + empName + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
	
}