package com.demo.collections.ArrayList;

import java.util.ArrayList;

public class DemoArrayList_2 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add("a");
		al.add("b");
		al.add("c");
		
		System.out.println(al);
		String s ="" ;
		
		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			s = s.concat((String)obj);
		}
		System.out.println(s);
		
		System.out.println(s.toUpperCase());
	}
}