package com.demo.collections.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class DemoVector_3 {

	public static void main(String[] args) {

		Vector<Object> v = new Vector<Object>();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(true);
		v.add(false);
		v.add("anil");
		v.add("manisha");
		v.add(56.325);

		System.out.println(v);

		System.out.println(v.size());
		v.addElement("shailendra");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.addElement("vivek");
		System.out.println(v.size()+" "+v.capacity());
		
		System.out.println(v.elementAt(9));
		
		Enumeration<Object> e = v.elements();
		System.out.println(e);
		
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+",");
			}
	}

}
