package Method;

public class MaximumNumberusingVarargs {
	
	static int max(int ...a) {
		if(a.length==0)return Integer.MIN_VALUE;
		int m =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>m) 
				m=a[i];
		}
		return m;
	}
	
	public static void main(String args[]) {
		System.out.println(max());
		System.out.println(max(10,20,40));
		System.out.println(max(7,8,6,4,3,10));
		
		
		
	}

}
