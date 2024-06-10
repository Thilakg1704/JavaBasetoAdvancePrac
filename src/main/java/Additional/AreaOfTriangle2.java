package Additional;

import java.util.Scanner;

public class AreaOfTriangle2 {
	public static void main(String args[]) {
		
		// To find the Area of Triangle using sides of the Triangle
		
			int a,b,c,s;
			Scanner scan = new Scanner(System.in);
			System.out.println("To find the Area of Tringale "
					+ "by using value of sides of the triangle ");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			
			s = (a+b+c)/2;
			System.out.println("Area of the trinagle using the value of sides is" );
			System.out.println(s);
			
			//Square root method
			System.out.println("To find the value using square root method");
			
			double area = Math.sqrt(s*(s-a)*(s-b))*(s-c);
			System.out.println("the values is " + area);
			
	}

}
