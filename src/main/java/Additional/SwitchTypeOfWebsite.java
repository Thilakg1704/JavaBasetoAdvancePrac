package Additional;
import java.util.Scanner;

public class SwitchTypeOfWebsite {
	public static void main(String args[]) {
		
		String domain ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the website");
		domain = scan.nextLine();
		String ext = domain.substring(domain.lastIndexOf(".")+1);
		
		switch(ext) {
		
		case "com":System.out.println("Commercial");
		break;
		case "org":System.out.println("Organisation");
		break;
		case "gov":System.out.println("Goverment");
		break;
		default: System.out.println("Enter the valid extension name");

		}
	}

}
