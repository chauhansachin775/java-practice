package com.demo.comparator.Test_1;

import java.util.TreeSet;

public class DemoTest_1 {

	public static void main(String[] args) {
		
		TreeSet<DemoStudent_1> ts1 = new TreeSet<>();
		
		ts1.add(new DemoStudent_1(101, "sachin", "CJ", 1000));
		ts1.add(new DemoStudent_1(106, "anil", "AJ", 2000));
		ts1.add(new DemoStudent_1(103, "anuj", "DEV", 4000));
		
		System.out.println(ts1);
		
		TreeSet<DemoStudent_1> ts2 = new TreeSet<>(new StudentComparator());
		
		ts2.add(new DemoStudent_1(101, "sachin", "CJ", 1000));
		ts2.add(new DemoStudent_1(106, "anil", "AJ", 2000));
		ts2.add(new DemoStudent_1(103, "anuj", "DEV", 4000));
		
		System.out.println(ts2);
		

	}

}
