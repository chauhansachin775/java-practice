package java_programs;

public class DemoMultipleObjectCreation {
		
		int sno;
		String sname;
		String course;
		
		void setSno(int sno) {
			this.sno = sno;
		}
		
		int getSno() {
			return this.sno;
		}
		
		void setSname(String sname) {
			this.sname = sname;
		}
		
		String getSname() {
			return this.sname;
		}
		
		void setCourse(String course) {
			this.course = course;
		}
		
		String getCourse() {
			return this.course;
		}
		
		void display() {
			System.out.println("Sno: "+getSno());
			System.out.println("Sname: "+getSname());
			System.out.println("Course: "+getCourse());
		}

	public static void main(String[] args) {
		int i;
		DemoMultipleObjectCreation s[] = new DemoMultipleObjectCreation [4];
		for(i=1; i<=5;i++) {
		 s[i] = new DemoMultipleObjectCreation();
		// System.out.println(si);
		}

	}

}