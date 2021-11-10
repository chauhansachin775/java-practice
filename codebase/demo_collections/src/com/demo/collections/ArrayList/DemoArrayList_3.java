package com.demo.collections.ArrayList;

import java.util.ArrayList;

public class DemoArrayList_3 {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();

		al.add("sachin");
		al.add(1000);

		al.add("anil");
		al.add(2000);

		al.add("aman");
		al.add(3000);

		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.toUpperCase());
			} else
				System.out.println(al.get(i));
		}
	}

}
