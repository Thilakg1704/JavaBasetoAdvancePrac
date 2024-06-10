package Additional;

import java.util.Scanner;
 
public class StringChallenge {
	public static void main(String args[]) {
			//1. Find if the email id is on gmail
			//2.Find the user name and domain name from email
		
		//task 1.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your  email id");
		String email = scan.nextLine();
		
		System.out.println(email);
		boolean bool = email.matches("\\w*@gmail.*");
		
		System.out.println(bool);
		
		
		// 2.To Find the user name and domain name from email
		//to find user name
		
		if(bool== true) {
			System.out.println(email);
			int i = email.indexOf("@");
			String userName = email.substring(0, i);
			System.out.println("The user name is: "+userName);
			//to find domain name
			String domainName = email.substring(i+1,email.length());
			System.out.println("the domain name is: "+domainName);
			
		}
		else
		System.out.println("enter the proper mail id");
		
		
				
		
		
	}

}
