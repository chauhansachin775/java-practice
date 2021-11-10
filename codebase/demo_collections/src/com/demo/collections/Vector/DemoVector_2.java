package com.demo.collections.Vector;

import java.util.Vector;

public class DemoVector_2 {

	public static void main(String[] args) {
		
		Vector<Object> v2 = new Vector<>(5);
		v2.add("sachin");
		v2.add("anil");
		v2.add("aman");
		v2.add("anuj");
		v2.add("atul");
		
		Vector<Object> v3 = new Vector<>();
		v3.add(100);
		v3.add(200);
		v3.add(300);
		v3.add(400);
		v3.add(500);
		v3.add('a');
		v3.add('b');
		v3.add('c');
		v3.add('d');
		v3.add('e');
		System.out.println(v3);
		
		
		Vector<Object> v4 = new Vector<>();
		v4.add('a');
		v4.add('b');
		v4.add('c');
		v4.add('d');
		v4.add('e');
		System.out.println(v4);
		
		v4.removeAll(v3);
		
		System.out.println(v3);
		System.out.println(v4);
		
		
		Vector<Object> vecContainer = new Vector<>();
		
		vecContainer.add(v2);
		
		System.out.println(vecContainer);
		
		Vector<Object> vec = new Vector<Object>();
		System.out.println(vec.isEmpty());
		//vecContainer.add(v3);
		//vecContainer.add(v4);
		
		
		/*
		 * Vector<Object> v = new Vector<>(v4); System.out.println(v); v.add(89.5);
		 * System.out.println(v.elementAt(2)); v.remove(2); System.out.println(v);
		 * v.removeAll(v3);
		 */
	}
}