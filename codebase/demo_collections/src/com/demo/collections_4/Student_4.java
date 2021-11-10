package com.demo.collections_4;

public class Student_4 {
	
	private int sNo;
	private String sName;
	private String course;
	private double fee;
	
	

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Student_4(int sNo, String sName, String course, double fee) {
		this.sNo = sNo;
		this.sName = sName;
		this.course = course;
		this.fee = fee;
	}
	
	public String toString() {
		return "SNo: "+getsNo()+", "+"Name: "+getsName()+", "+"Course: "+getCourse()+", "+"Fee: "+getFee();
	}

}
