package lc_rp_architechture_demo_2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("which shape do you want to draw: ");
		String shape = in.nextLine();
		

		if (shape.equals("RECTANGLE") || shape.equals("rectangle")) {
			Painter p = new Painter();
			p.draw(new Rectangle());
			
		}else if(shape.equals("SQUARE")  || shape.equals("square")) {
			Painter p = new Painter();
			p.draw(new Square());
		}else if(shape.equals("CIRCLE") || shape.equals("circle")) {
			Painter p = new Painter();
			p.draw(new Circle());
		}else
			System.out.println("you have entered a wrong shape");
	}
}
