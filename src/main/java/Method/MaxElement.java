package Method;

public class MaxElement {
	
		static int max(int a[]) {
			int max1= a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]>max1) {
					max1=a[i];
				}	
			}
			return max1;
		}
	
	
	public static void main(String args[]) {
		int a[] = {1,2,3,4,96,7,56};
		
		System.out.println("Max number of an array "+max(a));
		
	}

}
