package Additional;
import java.util.Scanner;

public class ConditionalStatGrade {
	public static void main(String args []) {
		
		int m1,m2,m3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks for the  3 subjects,each subjet carries 100 marks");
		m1 = scan.nextInt();
		m2 =scan.nextInt();
		m3 = scan.nextInt();
		
		int total = m1+ m2+ m3;
		System.out.println("The total marks is: "+total);
		int average = total/3;
		System.out.println("The average mark is: "+average);
		if(average >=70) {
			System.out.println("Grade A");
			
		}
		else if(average >=60 && average <=70) {
			System.out.println("Grade B");
		}
		else if(average >=50 &&  average<=60) {
			System.out.println("Grade C");
		}
		else if(average >=40 && average <=50) {
			System.out.println("Grade D");
		}
		else  {
			System.out.println("Fail");
		}
		
	}

}
