package array;

public class IncreaseSizeofanArray {

	public static void main(String[] args) {
			int a[] = {1,2,3,4,5};
			int b []= new int [2*a.length]; 
			for(int i=0;i<a.length;i++) {
				 b[i]=a[i];
				 System.out.print(b[i]+" ");			 
			}
			a=b;
			System.out.println();
			System.out.println(a.length);
			for(int x:a) {
				System.out.print(x+" ");
			}
			
	}

}
