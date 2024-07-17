package Operators;

public class Swapping {
	public static void main(String args[]) {
		
		int a=4;
		int t =17;
		System.out.println("value of a: "+a+" value of t: "+t);
		
		a= a^t;
		t= a^t;
		a=a^t;
		System.out.println("value of a: "+a+" value of t: "+t);
		
	}

}
