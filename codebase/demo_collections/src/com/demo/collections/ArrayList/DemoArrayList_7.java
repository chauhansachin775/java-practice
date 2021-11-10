package com.demo.collections.ArrayList;

import java.util.ArrayList;

public class DemoArrayList_7 {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("a");
		al.add("b");
		al.add("c");
		
		System.out.println(al);
		
		String s1 = (String)al.get(1);
		String s2 = s1.toUpperCase();
		al.set(1,s2);
		System.out.println(al);
	}

}
