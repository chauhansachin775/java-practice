package java_programs;

import java.util.Scanner;

class GearShift_2{
	private int gear;
	
	void setGear(int gear) throws IllegalArgumentException {
		if(gear < 0 || gear >5) {
			throw  new IllegalArgumentException("Invalid gear");
	}
		this.gear= gear;
	}
	
	int getGear() {
		return gear;
	}
}
	
public class DemoEncapsulationBikeRider {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		GearShift_2 g1= new GearShift_2();
		
		while (true) {
			try {
				System.out.println("press gear:");
				g1.setGear(in.nextInt());
				int gear= g1.getGear();
				
				if(gear==0) {
					System.out.println("bike is nutral");
				}else {
					System.out.println("bike is running in:"+g1.getGear());
				}
				}catch(IllegalArgumentException e){
					System.out.println(e.getMessage());
					}
				}
		}
	}