package basic_logical_programming;

public class ArrayDoubleCharSearch {

	public static void main(String[] args) {
		String s1 = "leonardo dicaprio";
		// int count=0;
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
				for (int k = 0; k < i; k++) {
					if (ch[i] == ch[k]) {
						count = 0;
					}
				}
			}
			if (count > 1) {
				System.out.println(ch[i] + ":" + count);
			}
		}
	}
}
