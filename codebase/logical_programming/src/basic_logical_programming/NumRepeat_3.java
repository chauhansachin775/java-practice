package basic_logical_programming;

public class NumRepeat_3 {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for(i = 5; i >= 1; i--) {
			
			for(j = 5; j >= i; j--)
				System.out.print(j);
					System.out.println();
		}

	}

}