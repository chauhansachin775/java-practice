package demo_access_modifiers_package_p1;

public class Demo_2 {
	
	public int rollNo = 100;
	private String  name = "sachin";
	protected double salary = 900000;
	boolean nature = true;
	

	public static void main(String[] args) {
		Demo_2 demo = new Demo_2();
		
		System.out.println(demo.rollNo);
		System.out.println(demo.name);
		System.out.println(demo.salary);
		System.out.println(demo.nature);

	}

}
