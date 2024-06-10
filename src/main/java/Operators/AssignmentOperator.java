package Operators;

public class AssignmentOperator {
	public static void main (String args[]) {
		//AssignmentOperator
		int a = 10, b =20, c=10;
		System.out.println(a + " "+b);
		
		a= -10;
		b+=c;
		System.out.println("The value of a "+ a +"and b  " + b);
		System.out.println("The value of c is:" + c);
		 c += c;
		 System.out.println("The value of c is:" + c);
		 a %=a ;
		 System.out.println("The value of a v   is:" + a);
	}

}
