package Loop;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
			//Sum of n numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number =scan.nextInt();
		int sum =0;
		for(int i =1; i<=number;i++) {
			 sum = sum +i;	
		}
		 System.out.println(sum);
	}

}
