package com.demo.collections.ArrayList;

import java.util.ArrayList;

public class DemoArrayList_1 {

	public static void main(String [] args) {
		
		ArrayList<Object> al = new ArrayList<>(5);
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.size());
	
		
		al.add("sachin");
		al.add("anil");
		al.add(1);
		al.add(2);
		al.add(3);
		
		al.add('a');
		al.add(82.6);
		al.add(null);
		al.add(true);
		
		//System.out.println(al.oldCaspacity >> 1);
		System.out.println("size after adding elements:" +al.size());
		
		al.remove(7);      //remove
		
		System.out.println(al);
		
		al.add(0, "bro");     //insert
		
		System.out.println(al);
		
		al.add(4, "father");     //insert
		
		System.out.println(al);
		
		al.set(2, "ram");     //replace
		
		System.out.println(al);
		
		System.out.println(al.indexOf("ram"));
		
		al.add(8, "ram");      //firstIndex

		System.out.println(al);
		
		System.out.println(al.lastIndexOf("ram"));     //lastIndex
		
		//al.clear();
		
		System.out.println(al);
	}
}
