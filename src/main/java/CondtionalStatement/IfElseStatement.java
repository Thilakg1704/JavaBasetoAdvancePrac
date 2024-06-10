package CondtionalStatement;
import java.util.Scanner;

public class IfElseStatement 
{
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter your age to check eligible for vote ");
		int i = sc.nextInt();
		
		if(i>=0) {
			if(i<=17) {
				System.out.println("Not eligiblr for vote");
			}
			else
			{
				System.out.println("Eligible for vote");
			}
		}
		else {
			System.out.println("None");
		}
	}
}
