package com.demo.collections.LinkedList;

import java.util.LinkedList;

public class DemoLinkedList_3 {

	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<Object>();
		
		ll.add(10);
		ll.add("mother");
		ll.add("father");
		ll.add(99.5);
		ll.add(true);
		ll.add(new Integer(58));
		ll.add('b');
		
		System.out.println(ll);
		
		ll.addFirst("anil");
		System.out.println(ll);
		ll.addLast("sachin");
		System.out.println(ll);
		
		ll.add(3, "anil");
		System.out.println(ll);
		ll.removeFirstOccurrence(new String("anil"));
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println(ll.get(2));
		System.out.println(ll.getLast());
		
	}

}
