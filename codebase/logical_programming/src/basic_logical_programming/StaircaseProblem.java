package basic_logical_programming;

//import java.util.Formatter;

public class StaircaseProblem {

	public static void main(String[] args) {
		
		int n = 6;   //here I have taken an instance of 6 stairs.
		int k = 6;
		
		for (int i = 1; i <= n; i++) {
			int j = 1;
			
			for (; j <= i; j++) {
				if(j==1) {
				System.out.printf("%"+k+"c",'#');
				}else {
					System.out.print('#');
				}
				}		
			k--;
			System.out.println();

			}
				}

}
