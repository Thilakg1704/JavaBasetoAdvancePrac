package Additional;
import java.util.Scanner;
public class ConditionalStatfindRadixNumber {
	
	public static void main(String args[]) {
		//to Find Radix of a  number given in a String
		/*
		 * if String number ="0101011 "; -- binary number 2
		 *  //0-7         number ="123457" -- octal 8
		 *  //A-F, 0-9    number ="A23465bf"-- hexa 16
		 *  //0-9         number = "23445678997"-- decimal*/
		String number;
		Scanner inspect = new Scanner(System.in);
		System.out.println("Enter the number or alphabet\n to find whether it is Radix number");
		number = inspect.nextLine();
		if(number.matches("[01]+")) {
			System.out.println("It is Binary Radix =2");
		}
		else if(number.matches("[0-7]+")) {
			System.out.println("The number is octal Radix = 8");
		}
		else if(number.matches("[A-Fa-f0-9]+")) {
			System.out.println("It is  hexa Radix =16");
		}
		else if(number.matches("[0-9]+")) {
			System.out.println("It is a Decimal Radix");
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
