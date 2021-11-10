package com.demo.collections.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorDemo_2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		System.out.println();
		
		ListIterator<Integer> ltr = al.listIterator();
		
		while(ltr.hasNext()) {
			Integer i = (Integer)ltr.next();
			System.out.print(i+ ", ");
			ltr.set(66);
			ltr.set(96);
			}
		
		System.out.println();
		System.out.println(al);
	}

}
