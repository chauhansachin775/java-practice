package com.demo.cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class GetClassName {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<Object>();
		
		Enumeration<Object> e		= 	v.elements();
		Iterator<Object> itr		= 	v.iterator();
		ListIterator<Object> ltr	= 	v.listIterator();
				
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
	}

}
