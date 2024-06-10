package Operators;
import java.util.Scanner;
public class RelationalOperator {
	public static void main(String args[]) {
		//Relational Operators are--
		/* == equal  to 
		 * != Not equal to
		 * < less, <= less than or equal to
		 * > Greater than, >= Greater than or equal to */
		
		Scanner  scan = new Scanner(System.in);
		System.out.println("To find the realtional between two operator" );
		System.out.println("Enter the First number ");
		double a = scan.nextDouble();
		System.out.println("Enter the Second number ");
		double b = scan.nextDouble();
		System.out.println("a==b :" + (a==b));
		System.out.println("a!=b :" +(a!=b));
		System.out.println("a<b :" + (a<b) );
		System.out.println("a<=b :" + (a<=b));
		System.out.println("a>b :" + (a>b));
		System.out.println("a>=b :"+ (a>=b));
		
	}
}
