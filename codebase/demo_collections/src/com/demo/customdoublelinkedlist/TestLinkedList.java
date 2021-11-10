package com.demo.customdoublelinkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(12);
		list.add(20);
		list.add(18);
		
		list.show();
		System.out.println();
		list.insertAfter(12, 50);
		list.show();
		System.out.println();
		list.insertAfter(18, 104);
		list.show();
		System.out.println();
		System.out.println(list.size());
		System.out.println();
		System.out.println(list.delete(12));
		System.out.println(list.delete(50));
		System.out.println(list.delete(20));
		System.out.println(list.delete(18));
		System.out.println(list.delete(104));
		list.add(58);
		System.out.println();
		list.show();
		list.delete(58);
		list.show();
		System.out.println(list.size());
		
	}

}
