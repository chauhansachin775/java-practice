package basic_logical_programming;

public class NumRepeat_4 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int k;
		
		for(i = 1; i <= 5; i++) {
			
			for (j = 1; j <= 5; j++) {
				
				for(k = 1; k<=j; k++)
					System.out.print(k);
						System.out.println();
			}
		}

	}

}
