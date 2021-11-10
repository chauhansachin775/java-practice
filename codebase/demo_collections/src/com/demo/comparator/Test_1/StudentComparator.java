package com.demo.comparator.Test_1;

import java.util.Comparator;

public class StudentComparator implements Comparator<DemoStudent_1> {

	public int compare(DemoStudent_1 s1, DemoStudent_1 s2) {
		int snoDiff = s2.getSno() - s1.getSno();

		if (snoDiff < 0)
			return -1;
		else if (snoDiff > 0)
			return 1;
		else
			return 0;
	}
}
