package loops;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String args[]) {
		//Factorial of a number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its Factorial");
		int n = scan.nextInt();
		int multi = 1;
		for(int i =1;i<=n;i++) {
			multi = multi*i;
		}
		System.out.println(multi);
		
	}

}
