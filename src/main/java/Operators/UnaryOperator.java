package Operators;
import java.util.Scanner;

public class UnaryOperator {
	public static void main(String args[]) {
		
		//Unary operator
		double ac = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		double num = sc.nextDouble();
		
		num = +ac;
		System.out.println("The value will be changed to positive: "+ num);
		num = - ac;
		System.out.println("The value will be changed to negative: "+ num);
		num = ++ac;
		System.out.println("Pre increment : "+ num);
		num = ++ac;
		System.out.println("Post increment: "+ num);
		num = ac--;
		System.out.println("post decrement: "+ num);
		num = --ac;
		System.out.println("pre decrement: "+ num);
	}

}
