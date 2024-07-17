package array;

public class RotatinganArray {
	public static void main(String args[]) {
		
		int a[] = {10,2,3,4,5,8,6,54};
		int temp = a[0];
		for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=1;i<a.length;i++) {
			a[i-1]= a[i];
	}
		a[a.length-1]= temp;
		for(int x:a) {
			System.out.print(x+" ");
		}
		
	}
	
}
