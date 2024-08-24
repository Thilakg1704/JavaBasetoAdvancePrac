package oop;

class Subject{
	private String subId;
	private String subName;
	private int maxMarks;
	private int marksObt;
	
	public Subject(String subId, String subName) {
		this.subId =subId;
		this.subName = subName;
	}
	public Subject(String subId, String subName, int maxMarks, int markObt ) {
		this.subId =subId;
		this.subName = subName;
		this.maxMarks = maxMarks;
		this.marksObt = markObt;
	}
	//getter method
	public String getSubId() {return subId;}
	public String getSubName() {return subName;}
	public int getMaxMarks() {return maxMarks;}
	public int getMarksObt() {return marksObt;}
	
	//Setter method
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	public void setMarksObt(int marksObt) {
		this.marksObt = marksObt;
	}
	
	boolean isQualified() {
		return marksObt >= maxMarks/10*4;
	}
	public String toString() {
		return "Subject Id : "+ subId +"\nSubject Name : "+ subName +"\nMaximum Mark : "+ maxMarks + "\nMaark Obtained : " +marksObt;              
	}
	
}

class Student{
	private String rollNo;
	private  String name;
	private  String department;
	private  String Subject;
	
	public Student(String rollNo, String name ) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public Student(String rollNo, String name, String department, String Subject ) {
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.Subject = Subject;
	}
	
	public String getRollNo() {return rollNo;}
	public String getName() {return name;}
	public  String getDepartment() {return department;}
//	public Subject[] getSubject () {
//		
//	}
}

public class StudentSubjectDetails {
	
	public static void main(String args[]) {
		//Array Of Objects
		
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("S101","DSA",100,40);
		subs[1] = new Subject("S102","Java",100,80);
		subs[2] = new Subject("S103","Operating System",100,90);
		
		for(Subject s: subs) {
			System.out.println(s+"\n");
		}
		
	}

}
