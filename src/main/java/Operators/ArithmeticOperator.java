package Operators;
import java.util.Scanner;
public class ArithmeticOperator {
	public static void main (String args[]) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the First Number");
			float number1 = scan.nextFloat();
		System.out.println("Enter the Second Number");
		    float number2 = scan.nextFloat();
		   
		System.out.println("The sum of two numbers is : " + (number1+number2));
		System.out.println("The difference of two number is: "+ (number1- number2));
		System.out.println("The product of two number is : "+ (number1*number2));
		System.out.println("The reaminder of two number is: "+(number1%number2));
		
	}

}
