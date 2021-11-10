package java_programs;

public class DemoOverrideToStringMethod {

	
		// TODO Auto-generated method stub
		int 	eId ;
		String 	eName;
		double 	bal;
		
		public String toString() {
			//return eId+ ""+eName+""+bal;
			return "eId:\t"+eId+"\n"+ "eName:\t"+eName+"\n"+ "bal:\t"+bal ;
		}

		public static void main(String[] args) {
			
			DemoOverrideToStringMethod obj = new DemoOverrideToStringMethod();
								obj.eId = 1000;
								obj.eName = "sachin";
								obj.bal = 12000;
								
								System.out.println(obj);


	}

}
