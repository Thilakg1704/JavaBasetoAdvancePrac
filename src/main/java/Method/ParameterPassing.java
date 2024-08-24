package Method;

public class ParameterPassing {
	
		public int add(int x,int y) {
			int z= x+y;
			return z;
		}
		// parameter passing
		// if change the values in the method it will 
		// only modified inside the method
		
		public  void inc(int x) {
			x++;
			//incremented
		System.out.println(x);
		}

	public static void main(String[] args) {
		
		int a = 10, b=20, c;
		
		
		
			ParameterPassing pp = new ParameterPassing();
			c= pp.add(a, b);
			pp.inc(a);
			// value not changed
			System.out.println(a);
			System.out.println("addition :" + c);
			
		
	}

}
