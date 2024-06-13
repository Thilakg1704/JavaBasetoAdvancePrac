package loops;

import java.util.Scanner;

public class Fibonacci {
	       //Fibonacci Series
	public static void main(String args[]) {
			
		Scanner scan = new Scanner(System.in);
		int a =0;
		int b=1;
		System.out.println("Enter number of terms should be entered");
		int n =scan.nextInt();
		System.out.print(a+","+b+",");
		for(int i =0;i<n-2;i++) {
			int c= a+b;
			a=b;
			b=c;
			System.out.print(c+",");
		}
		
	}
}
