package Additional;

import java.util.Scanner;

public class ConditionalStatOddorEven {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find whether it is "
				+ "odd or even");
		
		double db = sc.nextDouble();
		if(db%2==0) {
			System.out.println("It is a Even Number");
			
		}
		else
			System.out.println("it is a Odd number");
			
		
		
		
		
		
	}

}
