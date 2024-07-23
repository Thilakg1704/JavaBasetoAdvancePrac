package miniProblems;

import java.util.Scanner;

public class DisplayNumberInWords {
	public static void main(String args[]) {
		// Display Number In  Words
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =scan.nextInt();
		String str = "";
		while(n>0) {
			int r= n%10;
			str = str +r;
			n/=10;
		}
		//System.out.println(str);
		char c;
		for(int i =str.length()-1;i>=0;i--) {
			c =str.charAt(i);
			switch(c) {
			case '0':System.out.println("zero");
			break;
			case '1':System.out.println("one");
			break;
			case '2':System.out.println("two");
			break;
			case '3':System.out.println("Three");
			break;
			case '4':System.out.println("Four");
			break;
			case '5':System.out.println("Five");
			break;
			case '6':System.out.println("Six");
			break;
			case '7':System.out.println("Seven");
			break;
			case '8':System.out.println("Eight");
			break;
			case '9':System.out.println("Nine");
			break;
			default:System.out.println("Enter the correct values");
			}
		}
	}
}
