package com.demo.map.hashmap;

import java.util.HashMap;

public class DemoHashMap_2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "sachin");
		hm.put(102, "anil");
		hm.put(103, "anil");
		hm.put(104, "vikas");
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("vikas"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		System.out.println(hm.get(104));
	}

}
