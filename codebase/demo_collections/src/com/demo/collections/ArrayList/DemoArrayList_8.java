package com.demo.collections.ArrayList;

import java.util.ArrayList;

public class DemoArrayList_8 {

	public static void main(String[] args) {
		
		ArrayList<Object> l = new ArrayList<>();
		
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		l.add(2, "father");
		System.out.println(l);
		
		ArrayList<Object> l2 = new ArrayList<>();
		l2.add("sachin");
		l2.add("anil");
		l2.add(10);
		l2.add("A");
		
		l.addAll(l2);
		System.out.println(l);
		System.out.println(l2);
		
		l.addAll(2, l2);
		System.out.println(l);
		
		l.retainAll(l2);
		System.out.println(l);
		l.removeAll(l2);
		System.out.println(l);
		System.out.println(l2);
		
		l.addAll(l2);
		System.out.println(l);
		System.out.println(l2);
	
	
	}

}
