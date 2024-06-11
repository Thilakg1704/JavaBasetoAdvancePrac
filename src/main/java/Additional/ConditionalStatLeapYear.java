package Additional;
import java.util.Scanner;
public class ConditionalStatLeapYear {
	public static void main(String args []) {
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year to find its Leap year or not");
		n = scan.nextInt();
		
		if(n%4==0) {
			if(n%100==0) {
				if(n%400==0) {
					System.out.println("It is a leap year");
				}
				else {
					System.out.println("No it is not a leap year");
					
				}
				
			}
			else {
				System.out.println("No it is not a leap year");
				
			}
		}
		else
			System.out.println("No it is not a leap year");
	}
	
	

}
