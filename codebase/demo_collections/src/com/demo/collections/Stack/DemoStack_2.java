package com.demo.collections.Stack;

import java.util.Enumeration;
import java.util.Stack;

public class DemoStack_2 {

	public static void main(String[] args) {

		Stack<Object> s = new Stack<Object>();

		s.push(10);
		s.push("sachin");
		s.push(56.214);
		s.push(true);
		Student s1 = new Student(101, "sachin", "core java", 1201);
		s.push(s1);
		System.out.println(s);

		// System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());

		Enumeration<Object> e = s.elements();

		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + ",");
		}
		System.out.println();
		System.out.println(s.search(new Student(101, "sachin", "core java", 1200)));

	}
}

class Student {
	int rollNum;
	String sname;
	String course;
	double fee;

	public Student(int rollNum, String sname, String course, double fee) {
		this.rollNum = rollNum;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		else if(obj instanceof Student) {
			Student s = (Student)obj;
			return (this.rollNum == s.rollNum) && (this.sname == s.sname)
					&& (this.course == s.course) && (this.fee == s.fee);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", sname=" + sname + ", course=" + course + ", fee=" + fee + "]";
	}
}
