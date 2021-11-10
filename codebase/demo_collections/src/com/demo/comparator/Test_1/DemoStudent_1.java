package com.demo.comparator.Test_1;

public class DemoStudent_1 implements Comparable<DemoStudent_1> {

	private int sno;
	private String sname;
	private String course;
	private double fee;

	public DemoStudent_1(int sno, String sname, String course, double fee) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public String toString() {
		return sno + " " + sname + " " + course + " " + fee;
	}

	public int compareTo(DemoStudent_1 s) {

		int snoDiff = this.sno - s.sno;

		if (snoDiff < 0)
			return -1;
		else if (snoDiff > 0)
			return 1;
		else
			return 0;
	}
}
