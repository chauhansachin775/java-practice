package com.demo.collections_4;

public class CollectionTest_4 {

	public static void main(String[] args) {
		DemoCollection_4 c = new DemoCollection_4();
		c.add(1);
		c.add(10);
		c.add(89);
		c.add("sachin");
		c.add(true);
		c.add(66.324);
		c.add(new Student_4(101, "sachin", "selenium", 8000));
		System.out.println(c);
		System.out.println(c.size());
		//System.out.println(c.remove(6));
		//System.out.println(c);
		//System.out.println(c.get(3));
		c.replace(2, "anil");
		System.out.println(c);
		c.insert(2, "manav");
		System.out.println(c);
	}

}
