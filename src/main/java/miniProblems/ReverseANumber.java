package miniProblems;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String args[]) {
		//Reverse a Number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int r;
		int rev =0;
		while(n>0) {
			r=n%10;
			rev = (rev*10)+ r;
			n/=10;
				
		}
		System.out.println(rev);
	}
	

}
