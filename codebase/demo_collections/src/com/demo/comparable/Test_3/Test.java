package com.demo.comparable.Test_3;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student (102, "sachin", "CJ", 1000));
		ts.add(new Student (100, "anil", "AJ", 2000));
		ts.add(new Student (103, "aman", "DEV", 6000));
		ts.add(new Student (109, "anuj", "SQL", 4500));
		
		System.out.println(ts);

	}

}
