package basic_logical_programming;

public class MethodDemo {

	public static int add(int a, int b) {
		int res = a+b;
		return res;
	}
	
	public static void main(String[] args) {

		int a = 20;
		int b = 30;
		
		long c = add(a,b);
		System.out.println(c);

	}

}
