package loops;

import java.util.Scanner;

public class DisplayDigitsofNumber {
	public static void main(String args[]) {
		
		//Display digits of a number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scan.nextInt();
		while(n>0)
		{
			int r = n%10;
			 n = n/10;
			 System.out.println(r);
			 
		}
		
	}

}
