package com.demo.comparable.Test_4;

import java.util.TreeSet;

public class ComparableOverride implements Comparable<Character>{

	public static void main(String[] args) {
		
		TreeSet<Character> ts = new TreeSet<Character>();
		ts.add('A');
		ts.add('D');
		ts.add('K');
		ts.add('B');
		ts.add('E');
		
		System.out.println(ts);
	}

	@Override
	public int compareTo(Character o) {
		Character ch = (Character)o;
		if(this instanceof ComparableOverride) {
			Character ch2 = (Character)this;
		}
		return ch.compareTo();
		
	}
}
