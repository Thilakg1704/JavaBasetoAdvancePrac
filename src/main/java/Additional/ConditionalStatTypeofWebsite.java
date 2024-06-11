package Additional;
import java.util.Scanner;
public class ConditionalStatTypeofWebsite {
	public static void main(String args[]) {
		
		//Find Type of website and Protocol used
		
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the website url");
		str = scan.nextLine();
		
		int n = str.indexOf(":");
		
		String protocol = str.substring(0, n);
		
		if(protocol.equals("http")) {
			System.out.println(protocol+"- Hyper Text Transfer Protocol");
		}
		else if(protocol.equals("https")) {
			System.out.println(protocol+"- Hyper Text Transfer Protocol Security");
			
		}
		else if(protocol.equals("ftp")) {
			System.out.println(protocol+"- File Transfer Protocol");
		}
		else
		{
			System.out.println("enter the valid one");
		}
		 String ext = str.substring(str.lastIndexOf(".")+1);
		 
		 if(ext.equals("com")) {
			 	System.out.println("Commercial");
		 }	
		 else if(ext.equals("org")) {
			 System.out.println("Organisation");
		 }
		 else if(ext.equals("net")) {
			 System.out.println("Network");
		 }
		 else {
			 System.out.println("enter the valid one");
		 }
		
		
	}

}
