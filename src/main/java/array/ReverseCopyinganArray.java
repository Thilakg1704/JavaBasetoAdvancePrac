package array;

public class ReverseCopyinganArray {
	public static void main(String args[]) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		int b[] = new int [a.length];
		System.out.println("value of a is:");
		for(int x:a) {
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("reverse value of a in b");
		for(int i=a.length-1;i>=0;i--) {
			
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
	}

}
