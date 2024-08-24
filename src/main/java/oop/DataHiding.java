package oop;

class RectangleTest{
	private double length;
	private double breadth;
	
	public double getLength(){
		return length;
		
	}
	public double getBreadth() {
		return breadth;
	}
	public void setLength(double l) {
		length = l; 
	}
	public void setBreadth(double b) {
		breadth =b;
	}
	
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
}
public class DataHiding {
	
	public static void main(String args[]) {
		
		RectangleTest r = new RectangleTest();
		r.setLength(20);
		r.setBreadth(30);
		System.out.println("area of Rectangle is : "+r.area());
		System.out.println("Perimeter of Rectangle is : "+r.perimeter());
		System.out.println(r.getBreadth());
		
		
		
	}

}
