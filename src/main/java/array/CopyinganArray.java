package array;

public class CopyinganArray {

	public static void main(String[] args) {
			//Copying an array of elements
		int a[]  = {1,23,4,56,65,4,6,7};
		int b[]= new int[a.length] ;
		
		for(int i=0;i<a.length;i++) {
			b[i]= a[i];
			System.out.print(b[i]+" ");
		}
		
	}

}
