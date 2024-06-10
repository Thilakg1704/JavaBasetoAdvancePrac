package Operators;

public class LogicalOperator {
	public static void main(String args []) {
		//Logical operator 
		/*AND, OR , NOT*/
		
		int a = 10;
		int b = 20;
		//as per AND gate if the first condition is false 
		//it will not move to the second condition
		System.out.println((a<b) && (a>b));
		//as per OR gate if the first condition is True 
		//it will not move to the second condition
		System.out.println((a<b) ||  (a>b));
		System.out.println((a<b));
		System.out.println(!(a<b));
		if(!(a>b)) {
			System.out.println("If the condition is  false, it will change to true"
					+ " for NotOperator");
		}
	}

}
