package array;

public class SecondLargestElement {
	public static void main(String args[]) {
		
		int arr[] = {2,35,5,6,7,3,244,7};
		
		int max1,max2;
		max1= max2=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				
				max2=max1;
				max1 =arr[i];  
				}
			else if(arr[i]>max2) {
				max2 =arr[i];
			}
		}     	
		System.out.println(max1);
		System.out.println(max2);
	}

}
