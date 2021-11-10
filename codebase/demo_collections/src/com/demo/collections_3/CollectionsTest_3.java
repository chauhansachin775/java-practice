package com.demo.collections_3;

public class CollectionsTest_3 {

	public static void main(String[] args) {
		
		DemoCollections_3 col = new DemoCollections_3();
		
		col.add("s");
		col.add("a");
		col.add("c");
		col.add("h");
		col.add("i");
		col.add("n");
		
		String s1 = new String("s");

		
		System.out.println(col.contains(s1));
	//	System.out.println(col.contains(new String("s")));

	}

}
