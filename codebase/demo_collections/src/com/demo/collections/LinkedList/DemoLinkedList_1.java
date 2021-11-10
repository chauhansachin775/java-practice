package com.demo.collections.LinkedList;

import java.util.LinkedList;

public class DemoLinkedList_1 {

	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<>();
		
		ll.add(55);
		ll.add(88);
		ll.add("sachin");
		ll.add(56.214);
		ll.add('t');
		ll.add(null);
		ll.add(true);
		ll.add(false);
		ll.add(null);
		ll.add(Integer.valueOf(66));
		ll.add(66);
		ll.add(new Integer(66));
		
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeFirstOccurrence(66);
		
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.remove((Integer)66);
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.set(2, 'G');
		System.out.println(ll);
		ll.add(3, true);

		System.out.println(ll);
		
		ll.add(5);
		ll.add(6);
		ll.add(2);
		ll.add(0);
				
		System.out.println(ll);
		System.out.println(ll.size());
		
	}
}
