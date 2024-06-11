package Additional;
import java.util.Scanner;
public class ConditionalStatFindingWeekDays {

	public static void main(String args[]) {
		//Display the name of day based on a Number
		
		short day;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 7\nto find the Which day it is");
		System.out.println("Week starts from Monday");
		day = scan.nextShort();
		if(day ==1) {
			System.out.println(" Day 1 is Monday");
		}
		else if(day ==2) {
			System.out.println(" Day 2 is Tuesday");
		}
		else if(day ==3) {
			System.out.println(" Day 3 is Wednesday");
		}
		else if(day ==4) {
			System.out.println(" Day 4 is Thursday");
		}
		else if(day ==5) {
			System.out.println(" Day 5 is Friday");
		}
		else if(day ==6) {
			System.out.println(" Day 6 is Saturday");
		}
		else if(day ==7) {
			System.out.println(" Day 7 is Sunday");
		}
		else {
			System.out.println("A week consists of only 7 days");
		}
		
	}
}
