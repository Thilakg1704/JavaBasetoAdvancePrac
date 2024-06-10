package SampleCoding.Coding;
import java.util.Scanner;
public class ScannerClass {
	public static void main(String args []) {
		//Creating instance object for scanner
		Scanner obj = new Scanner(System.in);
		String name;
		int age;
		float salary;
		System.out.println("Enter your name");
		name =obj.next();
		System.out.println("Enter your age");
		age = obj.nextInt();
		System.out.println("Enter your salary");
		salary = obj.nextFloat();
		
		System.out.println("Name= " + name);
		System.out.println("Age= "+ age);
		System.out.println("salary= "+salary);
		
	}

}
