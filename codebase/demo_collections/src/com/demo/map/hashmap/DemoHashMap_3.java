package com.demo.map.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoHashMap_3 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "sachin");
		hm.put(102, "anil");
		hm.put(103, "rahul");
		hm.put(104, "vikas");
		
		System.out.println(hm);
		
		Collection<String> c = hm.values();
		List<String> l = new ArrayList<String>(c);
		System.out.println(l);
		ListIterator<String> ltr = l.listIterator();
		
		while(ltr.hasNext()) {
			String s = (String)ltr.next();
			if(s.equals("vikas")) {
				ltr.set("ram");
			}
		}
		System.out.println(l);
		
		System.out.println(hm);

	}

}
