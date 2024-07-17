package array;

public class InsertanElement {
	//Inserting an Element
	public static void main(String args[]) {
	int a[] = new int[10];
	a[0] =1; a[1] =2;a[2] =3;a[3] =4;a[4] =5;a[5] =6; 
	int n=6;
	
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	int x =20;
	int index = 2;	
	for(int i= n;i>index;i--)
	
		a[i]= a[i-1];
		a[index] = x;
		
	
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	}
	

}
