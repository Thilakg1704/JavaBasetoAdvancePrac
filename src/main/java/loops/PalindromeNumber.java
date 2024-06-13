package loops;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		
		//Find the number is palindrome
		Scanner inspect = new Scanner(System.in);
		System.out.println("Enter a number to find whether it is Paindrome or not");
		int n = inspect.nextInt();
		int m =n;
		int rev =0;
		while(n>0) {
		int r=n%10;
		n =n/10;
		rev = rev*10+r;
		
		}
		System.out.println(rev);
		if(rev == m) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
