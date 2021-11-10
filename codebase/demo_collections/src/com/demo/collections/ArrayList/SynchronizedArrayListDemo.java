package com.demo.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("mango");
		al.add("banana");
		al.add("orange");
		al.add("guava");
		al.add("papaya");
		
		System.out.println(al);
		
		List<String> l = Collections.synchronizedList(al);
		System.out.println(l);

	}

}
