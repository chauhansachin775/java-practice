package com.demo.collections;

public class CollectionTest_1 {

	public static void main(String[] args) {
		
		DemoCollections_1 col = new DemoCollections_1();
		
		col.add("s");
		col.add("b");
		col.add("c");
		col.add(Integer.valueOf(66));
		col.add(66);
		col.add(new Integer(66));
		col.add(56.2);
		col.add(56.2);
		col.add(56.2);
		col.add("s");
		
		/*
		 * col.add("d"); col.add("e"); col.add(12); col.add(102); col.add("sachin");
		 * col.add("Anil"); col.add("s"); col.add(new Example(10,20));
		 */		
		System.out.println(col);
		
		System.out.println(col.contains("c"));
		
		//System.out.println(col.contains("s"));
		//System.out.println(col.contains("w"));
		
		//System.out.println(col.contains("sachin"));
		//System.out.println(col.contains("Anil"));
	}

}
