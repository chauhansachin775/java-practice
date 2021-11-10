package com.demo.comparable.Test_1;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<>();

		ts.add(new Student(101, "sachin", "CJ", 1000));
		ts.add(new Student(100, "anil", "AJ", 2000));
		ts.add(new Student(99, "aman", "DEV", 5000));
	
		System.out.println(ts);

	}

}
