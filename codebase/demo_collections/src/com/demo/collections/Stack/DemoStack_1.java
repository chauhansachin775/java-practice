package com.demo.collections.Stack;

import java.util.Stack;

public class DemoStack_1 {

	public static void main(String[] args) {
		
		Stack<Object> st = new Stack<Object>();
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		
		System.out.println(st);
		
		st.search(60);
		
		
	}

}
