package com.demo.set.hashset;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("sachin");
		hs.add("anil");
		hs.add("aman");
		
		String s = "sachin";
		String s1 = "sachin";
		int a = 10;
		
		System.out.println(System.identityHashCode(hs));
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(a));
	}

}
