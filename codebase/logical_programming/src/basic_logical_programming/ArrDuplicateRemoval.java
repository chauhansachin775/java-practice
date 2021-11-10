package basic_logical_programming;

public class ArrDuplicateRemoval {

	public static void main(String[] args) {
		String s1 = "aakash";
		String s2 = "";
		int i, j,k;
		for (i = 0; i < s1.length(); i++) {

			for (j = i + 1; j <= s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					//	s2 = s2+ s1.charAt();
				} else {
					
					for(k =0; k<= s2.length(); k++) {
					
						if(s2.charAt(k) == s2.charAt(j)) {
							
						}
						else {
							s2 = s2 + s1.charAt(k);
						}
					}
				}

			}

		}
System.out.println(s2);
	}

}
