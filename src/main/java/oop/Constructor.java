package oop;

class Cylinderc{
	
	private  double radius;
	private double height;
	
	public Cylinderc() {
		
		radius =1;
		height = 3;
		
	}
	public Cylinderc(double r, double h) {
		radius = r;
		height = h;
	}
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public void setRadius(double r) {
		radius =r;
	}
	public void setHeight(double h) {
		height = h;
	}
	
	
	public double lidArea() {
		return Math.PI *radius *radius;
	}
}

public class Constructor {
	
	public static void main(String args[]) {
		
		Cylinderc c = new Cylinderc();
//		Cylinderc c = new Cylinderc(10,20);
		
		// used getter setter method  for using the private values
		c.setHeight(40);  
		c.setRadius(30.36);
		System.out.println(c.lidArea());
		
	}
}
