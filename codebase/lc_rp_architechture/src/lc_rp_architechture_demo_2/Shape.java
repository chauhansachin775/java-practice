package lc_rp_architechture_demo_2;

public class Shape {

}

class Rectangle extends Shape {
	
	
	
	private double recArea;
	
	void setRectangleArea(double length, double bredth) {
		this.recArea = length * bredth;
	}
	
	double getRectangleArea() {
		return this.recArea;
	}
}

class Square extends Shape {
	
	private double squArea;
	
	void setSquareArea(double side) {
		this.squArea = side * side;
	}
	
	double getSquareArea() {
		return this.squArea;
	}
}

class Circle extends Shape {
	private double cirArea;
	
	void setCircleArea(double radius) {
		cirArea = 3.141 * radius * radius;
	}
	
	double getCircleArea() {
		return this.cirArea;
	}
}