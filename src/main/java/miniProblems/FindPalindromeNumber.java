package miniProblems;

import java.util.Scanner;

public class FindPalindromeNumber {
	public static void main(String args[]) {
		// To find the number is palindrome or not\
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  a number to find\n whether palindrome or not:");
		int n = sc.nextInt();
		int rev=0;
		int m=n;
		while(n>0) {
			int r = n%10;
			rev = rev*10+r;
			n/=10;
		}
		System.out.println(rev);
		if(rev==m) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
