package basic_logical_programming;

public class TimeConversion {
	
	public static String timeConversion(String s) {

	    String[] arr = s.split(":");
	    int int1 = Integer.valueOf(arr[0]);
	    
	    StringBuilder sb = new StringBuilder();
	    String time = null;
	        if(arr[2].contains("AM") && int1 == 12) {
	            arr[0] = "00";
	            
	            sb.append(arr[0]);
	            sb.append(":");
	            sb.append(arr[1]);
	            sb.append(":");
	            sb.append(arr[2].subSequence(0, 2));
	            time = sb.toString();
	        
	        }if(arr[2].contains("PM") && int1 == 12) {
	            arr[0] = "12";
	            
	            sb.append(arr[0]);
	            sb.append(":");
	            sb.append(arr[1]);
	            sb.append(":");
	            sb.append(arr[2].subSequence(0, 2));
	            time = sb.toString();
	        
	        }if(arr[2].contains("AM") && int1 < 12) {
	            arr[0] = arr[0];
	            
	            sb.append(arr[0]);
	            sb.append(":");
	            sb.append(arr[1]);
	            sb.append(":");
	            sb.append(arr[2].subSequence(0, 2));
	            time = sb.toString();
	        
	        }if(arr[2].contains("PM") && int1 < 12) {
	            int1 = int1 + 12;
	            arr[0] = String.valueOf(int1);
	            
	            sb.append(arr[0]);
	            sb.append(":");
	            sb.append(arr[1]);
	            sb.append(":");
	            sb.append(arr[2].subSequence(0, 2));
	            time = sb.toString();
	        }

	        return time;
	    }

	public static void main(String[] args) {
		String ArmyTime = TimeConversion.timeConversion("08:53:25PM");  //for example
		System.out.println(ArmyTime);
	}

}
