package oop;

 class Circle{
	public  double radius;
	public double area() {
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius*radius;
	}
	public double circumference(){
		return perimeter();
	}
	
}
public class Circle1 {
	
	public static void main(String args[])  {
		
		Circle c1 =  new Circle();
		c1.radius =7;
		System.out.println(c1.area());
		System.out.println(c1.circumference());
		System.out.println(c1.perimeter());
		
	}

}
