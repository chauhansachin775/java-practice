package java_programs;

import java.util.Scanner;

class GearShift {
	// static Scanner in = new Scanner(System.in);
	private int gear;

	void setGear(int gear) throws IllegalArgumentException{
		if (gear < 0 || gear > 5) {
			throw new IllegalArgumentException("invalid gear");
		}else {
			 if (gear == 1 && getGear() == 0 || gear == 1 && getGear() == 2) {
				this.gear = gear;
				System.out.println("bike is running in: " + getGear());
			} else if (gear == 2 && getGear() == 1 || gear == 2 && getGear() == 3) {
				this.gear = gear;
				System.out.println("bike is running in: " + getGear());
			} else if (gear == 3 && getGear() == 2 || gear == 3 && getGear() == 4) {
				this.gear = gear;
				System.out.println("bike is running in: " + getGear());
			} else if (gear == 4 && getGear() == 3 || gear == 4 && getGear() == 5) {
				this.gear = gear;
				System.out.println("bike is running in: " + getGear());
			} else if (gear == 5 && getGear() == 4) {
				this.gear = gear;
				System.out.println("bike is running in: " + getGear());
			} else if (gear == 0 || gear == 0 && getGear() == 1) {
				this.gear = gear;
				System.out.println("bike is nutral ");
			}else if(gear == 1 || gear == 2 || gear == 3 || gear == 4 || gear == 5) {
				throw new IllegalArgumentException("invalid gear");
			}
			
		}

	}

	int getGear() {
		return gear;
	}

}

public class DemoEncapsulation_BikeGear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		GearShift g1 = new GearShift();
		System.out.println("bike has started \n");
		while (true) {
			try {
			System.out.print("press gear: ");
			g1.setGear(in.nextInt());
			}catch(IllegalArgumentException e) {
				System.out.println("invalid gear");
			}
		}
	}
}