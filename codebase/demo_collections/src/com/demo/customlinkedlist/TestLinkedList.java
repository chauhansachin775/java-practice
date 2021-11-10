package com.demo.customlinkedlist;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(5);
		list.add(20);
		list.add(66);
		list.add(58);
		
		list.show();
		
		list.insertAfter(5, 101);
		System.out.println();
		list.show();
		
	}
}