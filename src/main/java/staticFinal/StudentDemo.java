package staticFinal;
import java.util.*;
class Student{
	private String rollNo;
	private static int count =1;
	private String generateRollNo () {
		Date d = new Date();
		
		String m = "16BCC"+ (d.getYear()+1900)+count;
		count ++;
		return m;
	}
	public String getRollNo() {
		return rollNo;
	}
	
	public Student() {
		rollNo = generateRollNo();
	}
	
}


public class StudentDemo {
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println(s1.getRollNo());
		System.out.println(s2.getRollNo());
		System.out.println(s3.getRollNo());
	}

}
