package oop;

class Cylinder{
	public double radius ;
	public  double  height;
	 
	public double lidArea() {
		return Math.PI *radius* radius;
	}
	public double totalSurfaceArea() {
		return  2*lidArea()+circumference()* height; 
	}
	public double volume() {
		return lidArea()*height;
	}
	public double circumference() {
		return 2*Math.PI*radius;
	}
}

public class CylinderTest {
	public static void main(String args[]) {
		
		Cylinder c1 = new Cylinder();
		c1.radius = 20.00;
		c1.height =40;
		
		System.out.println("Lid area of a Cylinder = "+c1.lidArea());
		System.out.println("Total Surface Area = "+c1.totalSurfaceArea());
		System.out.println("volume = "+c1.volume()	);
		
	}

}
