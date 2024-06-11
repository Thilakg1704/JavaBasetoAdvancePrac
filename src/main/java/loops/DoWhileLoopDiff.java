package loops;

public class DoWhileLoopDiff {
	
	public static void main(String args[]) {
		
		int i = 100;
		while(i<100)
		{
			System.out.println(i);
			i*=2;
		}
		System.out.println("Outside the loop,due to condition  satisfied ");
		
		do
		{
			System.out.println(i);
			i*=2;
		}while(i<100);
		System.out.println("Condition Satisfied and printed only one time\n"
				+ "due to it is EXit control loop");
	}

}
