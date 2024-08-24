package Method;

public class Gcdof2number {
	static int gcd(int m, int n) {
		
		while (m!=n) {
			if(m>n)
				m=m-n;
			else
				n=n-m;
		}
		return m;
	}
	public static void main(String args[]) {
//		int a=25, b=15;
		
		System.out.println(gcd(30,40));
	}
}
