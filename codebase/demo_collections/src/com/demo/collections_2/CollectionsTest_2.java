package com.demo.collections_2;

public class CollectionsTest_2 {

	public static void main(String[] args) {

		DemoCollections_2 col = new DemoCollections_2();
		
		col.add(10);
		col.add("a");
		col.add("s");
		col.add(10);
		col.add(20);
		col.add("a");
		col.add(new Example_2(7,8));
		

		System.out.println(col.contains(10));
		System.out.println(col.contains("c"));
		System.out.println(col.contains(new Example_2(7,8)));

		/*
		 * System.out.println(col.indexOf("s"));
		 * System.out.println(col.lastIndexOf("s"));
		 * System.out.println(col.lastIndexOf("a"));
		 * 
		 * System.out.println(col);
		 * 
		 * System.out.println(col.remove("s"));
		 */		System.out.println(col);

	}
}