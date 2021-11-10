package com.demo.collections.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo_1 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		v.add(16);
		
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer i = (Integer)e.nextElement();
			if(i % 2 != 0)
				System.out.println(i);
		}
		
		System.out.println(v);
	}

}
