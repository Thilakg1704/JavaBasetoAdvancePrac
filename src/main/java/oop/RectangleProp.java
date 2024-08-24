package oop;

import java.util.Scanner;

class Rectangle{
	 public int  length;
	public int breadth;
	
	public  int area() {
		return length * breadth;
	}
	public int perimeter() {
		return 2*(length+breadth);
	}
	
}
public class RectangleProp {
	public static void main(String args[]) {
		
		Rectangle rec = new Rectangle();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and breadth of Rectangle");
		int l = scan.nextInt();
		int b = scan.nextInt();
		rec.length = l;
		rec.breadth = b;
		
		System.out.println("Area of rectangle = "+rec.area());
		System.out.println("Perimeter of an Rectangle  = "+rec.perimeter());
		
	}

}
