package loops;

import java.util.Scanner;

public class ReverseaNumber {
	
	public static void main(String args[]) {
		//Reverse a number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse it");
		int n = scan.nextInt();
//		int r;
//		while(n>0) {
//			r = n%10;
//			n=n/10;
//			System.out.print(r);
//				
//		}
		int rev =0;
		while(n>0) {
			int r=n%10;
			rev = rev*10+r;
			n=n/10;
			
		}
		System.out.println(rev);
		
		
		
		
		
	}

}
