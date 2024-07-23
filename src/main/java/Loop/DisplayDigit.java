package Loop;

import java.util.Scanner;

public class DisplayDigit {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = scan.nextInt();
		int remainder=0;
		while(number>0) {
			remainder = number%10;
			number /=10;
			System.out.print(remainder+" ");
			
		}
		
	}

}
