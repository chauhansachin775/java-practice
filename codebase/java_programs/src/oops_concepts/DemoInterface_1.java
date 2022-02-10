package oops_concepts;

interface Shape {
	
	public double area();
	
	public String name();
	
	/*
	 * public static void performs() { System.out.println("hello"); }
	 */
	
	
	
}

class Rectangle implements Shape {
	
	int length, breadth;
	String name;
	
	Rectangle(int length, int breadth, String name) {
		this.length = length;
		this.breadth = breadth;
		this.name = name;
	}
	
	public double area() {
		return length * breadth;
	}
	
	public String name() {
		return name;
	}
	
}

class Circle implements Shape {
	
	double pi = 3.141, radius;
	String name;
	
	Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public double area() {
		return (double) pi * radius * radius;
	}
	
	public String name() {
		return name;
	}
	
}

public class DemoInterface_1 {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle(12, 12, "rect_1");
		System.out.println("the area of rectangle: "+rectangle.area());
		System.out.println("the name of rectangle: "+rectangle.name());
		
		Shape circle = new Circle(4, "circle_1");
		System.out.println("the area of circle: "+circle.area());
		System.out.println("the ame of circle: "+circle.name());

	}

}
