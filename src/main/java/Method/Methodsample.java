package Method;

public class Methodsample {
	
	static int max(int x, int y) {
		if(x>y)
			return x;
		else
			return y;
	}
	public static void main(String args[]) {
		 int a =10; int b =15;
		 int c=max(a, b);
		 System.out.println(c);
		 
//		 System.out.println(max(a, b));
		
		
	}
}
