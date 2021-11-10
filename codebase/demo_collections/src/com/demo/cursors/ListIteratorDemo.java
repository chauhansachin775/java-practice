package com.demo.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("sachin");
		ll.add("anil");
		ll.add("aman");
		ll.add("anuj");
		
		ListIterator<String> ltr = ll.listIterator();
		String s1 = (String) ltr.next();
		System.out.println((String) ltr.next());
		
		
		  while(ltr.hasNext()) { 
			  Object o = ltr.next(); 
		  System.out.println(o); 
		  String s= (String) ltr.next(); //System.out.println(s); if(s.equals("anil")) {
		 if(s.equals("anil")) {
		  ltr.remove();
		  } else if (s.equals("aman")) { 
			  ltr.add("ashu"); 
			  } else if(s.equals("anuj")) { 
				  ltr.set("akash"); 
				  } 
		  }

	}

}
