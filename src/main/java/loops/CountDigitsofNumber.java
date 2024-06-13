package loops;

import java.util.Scanner;

public class CountDigitsofNumber {
	public static void main(String args[]) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = Scan.nextInt();
		int count =0;
		while(n>0) {
			n=n/10;
			count++;
			
		}
		System.out.println(count);
	}

}
