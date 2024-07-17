 package Loop;

import java.util.Scanner;

public class Factorial {
	public static  void main(String args[]) {
		//Factorial 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the number to find the factorial");
		int n = sc.nextInt();
		int factorial =1;
		for(int i =1; i<=n;i++) {
			factorial = factorial *i;
		}
		System.out.println("The factorial value of "+ n +" is "+factorial);
	}
}
