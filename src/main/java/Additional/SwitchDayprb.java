package Additional;
import java.util.Scanner;
public class SwitchDayprb {
	
	public static void main(String args[]) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 7\nto identify the Days in a week");
		number = sc.nextInt();
		
		switch(number)
		{
		case 1 : System.out.println("Monday");
				break;
		case 2 : System.out.println("Tuesday");
				break;
		case 3 : System.out.println("Wednesday");
				break;
		case 4 : System.out.println("Thursday");
				break;
		case 5 : System.out.println("Friday");
				break;
		case 6 : System.out.println("Saturday");
				break;
		case 7 : System.out.println("Sunday");
				break;
		default: System.out.println("Invalid Number");
		}
	}
}
