package loops;

import java.util.Scanner;

public class DisplayMultiplicationTable {
	public static void main(String args[]) {
		//To Display Multiplication Table
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for which Multiplication table is required");
		int n = scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i +"x"+n+"="+n*i);
		}
		
	}

}
