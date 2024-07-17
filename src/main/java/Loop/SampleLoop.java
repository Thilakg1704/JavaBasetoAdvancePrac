package Loop;

public class SampleLoop {
	public static void main(String args[]) {
		for(int i =1; i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//Reverse
		for(int i = 10;i>0;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		int n=10;
		int multiple = 5;
		for(int i =1; i<=n*multiple;i=i*2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i =1,j=1;i<=10;i++,j=j*2) {
			System.out.println(i+" "+j);
		}
	}

}
