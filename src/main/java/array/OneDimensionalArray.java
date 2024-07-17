package array;

public class OneDimensionalArray {
	public static void main(String args[]) {
		//One Dimensional Array
		int a[] = new 	int[5];
		a[0] = 15;
		a[3] = 10;
		System.out.println(a[3]);
		for(int i =0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nPrinting reverse of an array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int x:a) {
			System.out.print(x);
		}
	}

}

