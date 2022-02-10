package basic_logical_programming;

public class ToReverseString {

	public static void main(String[] args) {
		
		String s = "Sachin";
		String res ="";
		char ch;
		
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			System.out.println(ch);
			System.out.println(res);
			System.out.println(res.length());
			res = ch+res;
		} 
		
		System.out.println("result: "+res);
		

	}

}
