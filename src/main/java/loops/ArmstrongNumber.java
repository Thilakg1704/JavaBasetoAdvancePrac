package loops;

public class ArmstrongNumber {
	public static void main(String args[]) {
		//Armstrong number - sum of cube of the number is equals to the number
		//eg 153
		// 1(cube)+5(cube)+3(cube)
		// 1+ 125+ 27 = 153
		
		int sum =0;
		int n=153;
		int m=n;
		while( n>0) {
			int r =n%10;
			
			n=n/10;
			sum = sum+ r*r*r;
		}
		System.out.println(sum);
		if(sum == m) {
		System.out.println("It is a Armstrong number");
		}
		else
			System.out.println("It is not a Armstrong number");
	}

}
