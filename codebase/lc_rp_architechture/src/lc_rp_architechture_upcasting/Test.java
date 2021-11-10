package lc_rp_architechture_upcasting;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.eat(new Apple());
		p1.eat(new Mango());
		p1.eat(new Orange());

	}
}

