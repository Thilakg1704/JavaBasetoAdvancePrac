package oop;

class StudentDetails{
	public  int rollNo;
	public String name;
	public  String course;
	public int m1,m2,m3;
	
	public int 	 total() {
		return m1+m2+m3;
		
	}
	public int average() {
		return total()/3;
	}
	public  char grade() {
		
		if(average()>=60) {
			return  'A';	
		}
		else 
			return 'B';
	}
	public String toString() {
		
		return "Roll no: "+rollNo+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n"+"Grade:"+grade();
	}
}

public class Studentmain {
	public static void main(String args[]) {
		
		StudentDetails s = new StudentDetails();
		s.rollNo = 1704;
		s.name = "Thilak";
		s.m1=40;
		s.m2 =60;
		s.m3 = 80;
		s.course ="CSA";
		
		System.out.println("Total: "+s.total());
		System.out.println("Average: "+s.average());
	 	System.out.println();
		System.out.println("Details: \n"+ s);// using toString method
		
		
	}

}
