package com.demo.collections.Vector;

import java.util.Vector;

public class DemoVector_1 {

	public static void main(String[] args) {
		
		int[] arr ;
		arr = new int[8];
		

		Vector<Object> rec = new Vector<>(5, 4);
		
		System.out.println(rec.size());
		System.out.println(rec.capacity());
		
		rec.add(1);
		rec.add("red");
		rec.add(3);
		rec.add(4);
		rec.add("blue");
		rec.add("yellow");
		
		
		System.out.println(rec);
		System.out.println(rec.size());
		System.out.println(rec.capacity());
		
		rec.add("sachin");
		rec.add("anil");
		rec.add("aman");
		
		System.out.println(rec.size());
		System.out.println(rec.capacity());

		
		rec.add(null);
		rec.add('r');
		rec.add(89.567);
		rec.add(Integer.valueOf(66));
		rec.add(66);
		rec.add(new Integer(66));
		
		System.out.println(rec);
		
		boolean b = rec.remove(89.567);
		System.out.println(b);
		
		rec.remove(null);
		rec.remove("aman");
		System.out.println(rec);
		
		System.out.println(rec.size());
		System.out.println(rec.capacity());

		
		//vec.remove(459);  AIOOBE
		//vec.remove(889);
		
		System.out.println(rec);
		rec.set(5, "manisha");
		
		System.out.println(rec);
		rec.add("shailendra");
		System.out.println(rec);
		
		
	}
}