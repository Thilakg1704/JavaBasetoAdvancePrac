package abstracteg;

abstract class Shape{
	
	abstract void area();
	abstract void perimeter();
	
}

class Circle extends Shape{
	
	double radius;
	@Override
	void perimeter() {
		System.out.println(2*Math.PI*radius);
	}
	@Override
	void area() {
		System.out.println(Math.PI*radius*radius);
	}
	
}
class Rectangle extends Shape{
	int length;
	int breadth;
	@Override
	void perimeter() {
		System.out.println(2*(length+breadth));
	}
	@Override 
	void area() {
		System.out.println(length*breadth);
	}
}

public class ShapeMain {
	
	public static void main(String rags[]) {
		
		Circle c1 = new Circle();
		c1.radius = 20.00;
		c1.area();
		
	}

}
