package oop;


// Parent Class
class Circle2{
	public double radius;
	
	public double area() {
		return Math.PI * radius * radius;
	}
	public double perimeter() {
		return 2* Math.PI* radius;
		
	}
	public double circumference() {
		return perimeter();	
	}
}

// Child Class
class Cylinder2 extends Circle2{
	public double height;
	
	public double Volume() {
		return area()* height;
	}
}
public class CylinderConnector {
	
	public static void main(String args[]) {
		
		Cylinder2 c = new Cylinder2();
		c.radius =10;
		c.height = 7;
		
		
		System.out.println("Volume = "+ c.Volume());
		System.out.println("Area = "+c.area());

		
	}
}
