package java_programs;

public class StudentCollege {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.stdId = 101;
		s1.stdName = "Aman";
		s1.course = "Core Java";
		s1.fee = 1000;

		Student s2 = new Student();

		s2.stdId = 102;
		s2.stdName = "Anuj";
		s2.course = "Planning";
		s2.fee = 2000;

		System.out.println("First student Info: \n");

		System.out.println("s1.stdId \t:" + s1.stdId);
		System.out.println("s1.stdName \t:" + s1.stdName);
		System.out.println("s1.course \t:" + s1.course);
		System.out.println("s1.fee \t \t:" + s1.fee);

		System.out.println();
		System.out.println("Second student Info:\n");

		System.out.println("s2.stdId \t:" + s2.stdId);
		System.out.println("s2.stdName \t:" + s2.stdName);
		System.out.println("s2.course \t:" + s2.course);
		System.out.println("s2.fee \t \t:" + s2.fee);

	}

}
