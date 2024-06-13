package loops;

import java.util.Scanner;

public class DisplayAPseries {
	public static void main(String args[]) {
		//Display a Arithmetic Progression series
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter from which the number should starts with:");
		int a = scan.nextInt();
		System.out.println("Enter the difference of number should be");
		int  d = scan.nextInt();
		System.out.println("Enter how terms you needed");
		int n =scan.nextInt();
		int term=a;
		for(int i=0;i<n;i++) {
			System.out.print(term+",");
			term =term +d;
			
			
		}
	}
}
