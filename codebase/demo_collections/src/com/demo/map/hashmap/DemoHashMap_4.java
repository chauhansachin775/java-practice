package com.demo.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class DemoHashMap_4 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "sachin");
		hm.put(102, "anil");
		hm.put(103, "rahul");
		hm.put(104, "vikas");
		
		System.out.println(hm);
		
		Set<Map.Entry<Integer, String>> s = hm.entrySet();
		System.out.println(s);
		
		Iterator<Map.Entry<Integer, String>> itr = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> m = (Map.Entry<Integer, String>)itr.next();
			if(m.getKey().equals(104)) {
				m.setValue("ram");
			}
		}
		System.out.println(hm);
	}

}
