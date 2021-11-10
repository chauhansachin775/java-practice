package com.demo.collections.ArrayList;

import java.util.ArrayList;



public class DemoArrayList_4 {

	public static void main(String[] args) {
		// searching StringBuilder Object in array list
		
		ArrayList<StringBuilder> al = new ArrayList<StringBuilder>();
		al.add(new StringBuilder("a"));
		al.add(new StringBuilder("b"));
		
		StringBuilder sb = new StringBuilder("c");
		al.add(sb);
		
		System.out.println(al.contains(new StringBuilder("a")));
		System.out.println(al.contains(sb));
		
			

	}

}
