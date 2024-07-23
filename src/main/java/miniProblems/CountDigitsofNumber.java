package miniProblems;

import java.util.Scanner;

public class CountDigitsofNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int  n = scan.nextInt();
		int count =0;
		int remainder;
		while(n>0) {
			remainder = n%10;
			n/=10;
			count ++;
		}
		System.out.println(count);
	}

}
