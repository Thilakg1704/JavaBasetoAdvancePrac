package loops;

import java.util.Scanner;

public class DisplayGPseries {
		public static void main(String args[]) {
			//Display GP series 
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number to starts with");
			int a= scan.nextInt();
			System.out.println("Enter the number for the difference");
			int d = scan.nextInt();
			System.out.println("Enter the number of terms need to be printed");
			int n =scan.nextInt();
			int term = a;
			for(int i=0;i<n;i++) {
				System.out.print(term+",");
				term = term *d;
			}
				
			
		}
}
