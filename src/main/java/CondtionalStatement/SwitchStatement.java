package CondtionalStatement;
import java.util.Scanner;

public class SwitchStatement {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find odd or even");
		int num = scan.nextInt();
		
		switch(num %2) {
		
		case 0 :
			System.out.println("It is Even number");
			break;
		case 1:
			System.out.println("It is odd number ");
			break;
		default:
			System.out.println("None");
		}
		
		
		
	}

}
