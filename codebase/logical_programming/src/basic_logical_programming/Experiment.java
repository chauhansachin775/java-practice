package basic_logical_programming;

public class Experiment {
	
	public static void main(String[] args) {
		/*int[] arr = {1,2,3,4,5};
		int[] sum = new int[5];
		int totalSum =0;
		int max=0;
		
		for(int i = 0; i < arr.length; i++) {
			totalSum = arr[i] + totalSum;
 		}
		System.out.println(totalSum);
		System.out.println();
		
		for (int j = 0; j < arr.length; j++) {
			sum[j] = totalSum - arr[j];
			
			System.out.println(sum[j]);
		}
		
		for (int i = 0; i < sum.length; i++) {
			int j = i+1;
			for (; j < sum.length; j++) {
				if(sum[i]>sum[j]) {	
					max= sum[i];
				}else {
					max= sum[j];
					//System.out.println(max);
					break;
				}
				
			}
		}
		System.out.println(max);
		*/
		
		/*int[] arr = {10,9,8,7,6,5};
		int max = 0;
		int currentMax =0;
		int previousMax =0;
		//int currentMax = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = i+1;
			for (; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					currentMax = arr[i];
				}else {
					currentMax = arr[j];
				}
			previousMax = currentMax;
			//System.out.println(previousMax);
			}
			if(previousMax > currentMax) {
				max = previousMax;
			}else {
				max = currentMax;
			}
		}
		System.out.println(max); */
		
		/*int[] arr = {10,9,8,7,6,5};
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int j=i+1;
			for (; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					max = arr[i];
					System.out.println(max);
				}else {
					max = arr[j];
				}
			}			
		}
		System.out.println(max);
		*/
		//char ss = '';
		//System.out.println(ss);
		//float f1 = 10;
		//float f2 = f1;
		//double d = f1;
		//int a = (byte)d;
		/*int a = 10;
		byte b1 = (short)a;
		byte b2 = (short)(byte)a;
		byte b3 = (byte)(short)a;
		*/
		
		//int a = 254;
		//byte b1 = (byte)a;
		
		/*float f = 10.254f;
		int a = (int)f;
		long l = (long)f;
		int a1 = (int)l;
		*/
		
		/*long l = 10;
		//int i = l;
		float f = l;
		float f1 = 10;
		long l1 = (long)f1;
		char ch = 250;
		*/
		
		
		/*int[] arr = {55,44,789,2,67};
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println(min);
		//System.out.println(ch);\
		 
		 */
			
		/*int[] arr = {3,3,3,1,1};
		int max = arr[0];
		int maxCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(max == arr[i])
				maxCount++;
		}
		System.out.println(max);
		System.out.println(maxCount);
		*/
		
	/*	String s = "05:15:23AM";
		//s.split(":", 2);
		String[] arr = s.split(":");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int int1 = Integer.valueOf(arr[0]);
		System.out.println(int1);
	*/	
		/* if(arr[2].contains("AM")) {
			String[] arr1 = arr[2].split("AM");
			System.out.println(arr1[0]);
		}else if(arr[2].contains("PM")) {
			String[] arr2 = arr[2].split("PM");
					System.out.println(arr2[0]);
		}
		
		*/
		/* StringBuilder sb = new StringBuilder();
		if(arr[2].contains("AM") && int1 == 12) {
			arr[0] = "00";
			
			sb.append(arr[0]);
			sb.append(":");
			sb.append(arr[1]);
			sb.append(":");
			sb.append(arr[2].subSequence(0, 2));
			System.out.println(sb.toString());
		
		}if(arr[2].contains("PM") && int1 == 12) {
			arr[0] = "12";
			
			sb.append(arr[0]);
			sb.append(":");
			sb.append(arr[1]);
			sb.append(":");
			sb.append(arr[2].subSequence(0, 2));
			System.out.println(sb.toString());
		
		}if(arr[2].contains("AM") && int1 < 12) {
			arr[0] = arr[0];
			
			sb.append(arr[0]);
			sb.append(":");
			sb.append(arr[1]);
			sb.append(":");
			sb.append(arr[2].subSequence(0, 2));
			System.out.println(sb.toString());
		
		}if(arr[2].contains("PM") && int1 < 12) {
			int1 = int1 + 12;
			arr[0] = String.valueOf(int1);
			
			sb.append(arr[0]);
			sb.append(":");
			sb.append(arr[1]);
			sb.append(":");
			sb.append(arr[2].subSequence(0, 2));
			System.out.println(sb.toString());
		}
		
		*/
		
	/*	int[] grds = {73,67,38,33};
		
		
		for(int i = 0; i < grds.length; i++) {
			if(grds[i] < 38) {
				grds[i] = grds[i];
			}else if(grds[i] == 38) {
				grds[i] = 40;
			}else if(grds[i] > 38) {
				int quo = grds[i] / 5;
				int min = quo * 5;
				int x = 5 - (grds[i] - min); 
				if(x <3) {
					grds[i] = grds[i] + x;
				}else {
					grds[i] = grds[i];
				}
			}
		}
		
		for(int j = 0; j < grds.length; j++) {
			System.out.println(grds[j]);
		}
		*/
		
		//double d = 'g';
		//System.out.println(d);
		
		/*
		 * String str = "Sachin"; String result = ""; char ch;
		 * 
		 * System.out.println(str); System.out.println(result);
		 * 
		 * for(int i = 0; i< str.length(); i++) { ch = str.charAt(i); result =
		 * ch+result; //concatination operation System.out.println(result.length());
		 * System.out.println(result.charAt(i)); }
		 * 
		 * System.out.println(result);
		 */		
		
		/*
		 * String str = "sachin"; char[] arr = new char[str.length()];
		 * 
		 * for (int i = str.length()-1, j=0; i >=0; i--, j++) { arr[j] =str.charAt(i); }
		 * System.out.println(arr);
		 */
		
		/*
		 * String str = "sachin"; char [] arr = str.toCharArray();
		 * 
		 * for (int i = arr.length-1; i >= 0; i--) { System.out.print(arr[i]); }
		 */		
		
		/*
		 * int [] arr = {1,2,3,4,5,6,7,9,10};
		 * 
		 * int totalCount = 0, totalEle = 10;
		 * 
		 * 
		 * for(int i =0; i <= arr.length-1; i++) { totalCount = totalCount + arr[i];
		 * 
		 * } int expectedCount = ((totalEle)*(totalEle + 1))/2;
		 * System.out.println(expectedCount - totalCount);
		 */
		
		/*
		 * int [] arr = {1,2,3,3,4,5,5,5};
		 * 
		 * for(int i = 0, j=1; i < arr.length && j <arr.length; i++, j++) {
		 * if(arr[i]==arr[j]) { System.out.println(arr[jz]); }
		 * 
		 * }
		 */
		
		
         
	       // System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
		/*
		 * for(int i = 0; i < arr.length; i++) { for(int j = i + 1; j < arr.length; j++)
		 * { if(arr[i] == arr[j]) System.out.println(arr[j]); } }
		 */  
		
		
		/*
		 * int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 8, 3}; int [] dub =
		 * 
		 * for(int i = 0; i< arr.length; i++) { for(int j = 1; j< arr.length; j++) {
		 * 
		 * } }
		 */		
		
		/*
		 * String s = new String("sachin"); s.concat("chauhan"); System.out.println(s);
		 */
		
		
		String s = "sachin";
		//s.concat("chauhan");
		System.out.println(s.concat("chauhan"));
	}
}