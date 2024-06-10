package Additional;
import java.util.Scanner;

public class ConditionalStatYoungorAged {
	
	public static void main(String args[]) {
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age: \n to find YOUNG or AGED");
		age = scan.nextInt();
		if(age >=14 && age <=55) {
			System.out.println("The person is younger");
		}
		else if(age >55) {
			System.out.println("The person is older ");
		}
		else {
			System.out.println("The person is below 14 and he is a kid");
		}
		
		
	}

}
