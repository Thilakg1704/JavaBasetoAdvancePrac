package Method;

public class MethodOverload {
	
	static int max(int x, int y) {
		return x>y? x:y;
	}
	static int max(int x, int y,int z) {
		return x>y&& x>z?x:(y>z?y:z) ;
	}
	static float max(float x, float y) {
		return x>y? x:y;
	}
	
	public static void main(String args[]) {
		System.out.println(max(40, 20,30));
		System.out.println(max(5.6f, 5.4f));
		System.out.println(max(20, 350));
		
	}

}
