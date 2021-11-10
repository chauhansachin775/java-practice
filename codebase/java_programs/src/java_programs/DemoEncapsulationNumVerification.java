package java_programs;

import java.util.Scanner;

class NumberValidation {
	int num;

	void setNum(int num) throws IllegalArgumentException, ArithmeticException, IllegalStateException {
		if (num < 0) {
			throw new IllegalArgumentException("negative number not allowed");
		} else if (num == 0) {
			throw new ArithmeticException("zero not allowed");
		} else if (num > 0 && num < 10 || num > 50) {
			throw new IllegalStateException("value must be b/w 10-50");
		}
		this.num = num;
	}

	int getNum() {
		return num;
	}
}

public class DemoEncapsulationNumVerification {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		NumberValidation num1 = new NumberValidation();

		while (true) {
			try {
				System.out.println("enter a number:");
				num1.setNum(in.nextInt());
				int num = num1.getNum();
				if (num >= 10 && num <= 50) {
					System.out.println("true!!! number in range");
				}
			} catch (IllegalArgumentException e1) {
				System.out.println(e1.getMessage());
			} catch (ArithmeticException e2) {
				System.out.println(e2.getMessage());
			} catch (IllegalStateException e3) {
				System.out.println(e3.getMessage());
			}
		}
	}
}
