package loops;

import java.util.Scanner;

public class SumOfNnumbers {
	public static void main(String args[]) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a number: So we can find the sum of n numbers");
		int n = Scan.nextInt();
		//using formula
		for(int i =1;i<=n;i++) {
			System.out.print(i= (n*(n+1))/2);
		}
		//normal method
		System.out.println();
		System.out.println("enter a number");
		int m = Scan.nextInt();
		int  sum=0;
		for(int j =1;j<=m;j++) {
			
			sum =sum+j;		
			
		}
		System.out.println(sum);
		
	}

}
