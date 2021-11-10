package lc_rp_architechture_upcasting;

public class Person {

	void eat(Fruit f) {

		if (f instanceof Mango) {
			Mango m1 = (Mango) f;
			System.out.println(m1.color);
			System.out.println(m1.size);
		} else if (f instanceof Apple) {
			Apple a1 = (Apple) f;
			System.out.println(a1.color);
		} else if (f instanceof Orange) {
			Orange o1 = (Orange) f;
			System.out.println(o1.c);
		} else
			System.out.println("no fruit");

	}
}
