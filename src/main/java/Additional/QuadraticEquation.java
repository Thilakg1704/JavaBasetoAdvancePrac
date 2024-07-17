package Additional;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String args[]) {
		int a,b,c;
		double r1,r2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a, b, c : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		r1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
		r2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		System.out.println("The value of r1 is :"+ r1+" "+r2);
		
			
	
		
	}

}
