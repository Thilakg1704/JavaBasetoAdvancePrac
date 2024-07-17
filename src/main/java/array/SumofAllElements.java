package array;

public class SumofAllElements {
	public static void main(String args[]) {
		
		//Going through array of elements is can be called as
		//traversing or Scanning
		int sum =0;
		int arr[] = {2,4,6,3,2,78};
		
		for(int i=0;i<arr.length;i++) {
			sum = sum +arr[i];
			
		}
		System.out.print(sum);
	}

}
