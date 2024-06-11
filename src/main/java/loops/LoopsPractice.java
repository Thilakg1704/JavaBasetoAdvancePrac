package loops;

public class LoopsPractice {
	public static void main(String args[]) {
		
		//while loop and do while with examples
		
		//while loop - Entry control loop
		
		int i =1; //initialization
		while(i<100) //Condition
		{
			System.out.println(i);
			i*=2;
		}
		System.out.println("Outside the while loop: "+i);
		//do while loop - Exit Control loop
		int n =1;
		do 
		{
			System.out.print(n+" ");
			n*=2;
		}while(n<100);//Condition
		System.out.println("\nOutside the while loop: "+n);
		
	}
	

}
