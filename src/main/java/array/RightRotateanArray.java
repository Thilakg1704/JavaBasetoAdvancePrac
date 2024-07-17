package array;

public class RightRotateanArray {

	public static void main(String[] args) {
			
		int arr[]= {1,8,4,2,5,7};
		
		int temp = arr[arr.length-1];
		
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int i=arr.length-2;i>=0;i--) {
			arr[i+1] = arr[i];
			
		}
		arr[0] =temp;
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		
	}

}
