package Additional;
import java.util.Scanner;
public class SwitchMenuDrivenPrbl {
	public static void main(String args[]) {
		
		//Menu Driven program for Arithmetic Operations
		
		double number1,number2 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for Arithmetic Operation");
		number1 = scan.nextDouble();
		number2 = scan.nextDouble();
		System.out.println("Enter whcih type of operaion should be done\nOperations\n======\n"
				+ "1.ADD\n2.SUB\n3.DIV\n4.MULTIPLY");
		scan.nextLine();
		System.out.println("Enter anyone of the  operation as per above listed");
		int option= scan.nextInt();
		switch(option) 
		{
		case 1:System.out.println("The sum of two numbers is: "+ (number1+number2));
		break;
		case 2:System.out.println("The sum of two numbers is: "+ (number1-number2));
		break;
		case 3:System.out.println("The sum of two numbers is: "+ (number1/number2));
		break;
		case 4:System.out.println("The sum of two numbers is: "+ (number1*number2));
		break;
		default: System.out.println("Enter the values and opeartions Correctly");
		}
		
		
	}

}
                                                