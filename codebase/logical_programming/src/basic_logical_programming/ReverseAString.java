package basic_logical_programming;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "sachin";
		
		String s2 = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			s2 = s.charAt(i)+s2;
		}
		
		System.out.println(s2);

	}

}
