package lc_rp_architechture_demo_2;

import java.util.Scanner;

public class Painter {
	Scanner in = new Scanner(System.in);
	
	void draw(Shape s) {
		if(s instanceof Rectangle) {
			Rectangle r1 = (Rectangle)s;
			System.out.println("enter length: ");
			double length = in.nextDouble();
			System.out.println("enter bredth: ");
			double bredth = in.nextDouble();
			r1.setRectangleArea(length, bredth);
			System.out.println("Area of Rectangle: " +r1.getRectangleArea());
		}else if(s instanceof Square) {
			Square s1 = (Square)s;
			System.out.println("enter side: ");
			double side = in.nextDouble();
			s1.setSquareArea(side);
			System.out.println("Area of Square: " +s1.getSquareArea());
		}else if(s instanceof Circle) {
			Circle c1 = (Circle)s;
			System.out.println("enter radius: ");
			double radius = in.nextDouble();
			c1.setCircleArea(radius);
			System.out.println("Area of circle: " +c1.getCircleArea());
		}
	}

}
