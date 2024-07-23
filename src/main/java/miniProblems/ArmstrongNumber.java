package miniProblems;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		//To find the number is Armstrong or not
		//sum of cube of the number is Armstrong number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find the number  is Armstrong number or not");
		int number = scan.nextInt();
		int sum =0;
		int alter_Storage = number;
		while(number>0) {
			int r = number%10;
			number /=10;
			sum = sum + r*r*r;
				
		}
		
		System.out.println(sum);
		if(sum == alter_Storage) {
			System.out.println("It is a ArmStrong number");
		}
		else {
			System.out.println("It is not a Armstrong number");
		}
	}

}
