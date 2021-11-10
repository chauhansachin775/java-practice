package basic_logical_programming;

public class NameStar {

	public static void main(String[] args) {
		String s = "SACHIN";
		char[] chArr = s.toCharArray();
		int i,j,indx=0;
		for (i = 0; i< chArr.length; i++) {
			System.out.print(chArr[indx]);
			for (j = 0; j <=indx; j++) {
				System.out.print("*");
				}
			indx++;
			
		}

	}

}
