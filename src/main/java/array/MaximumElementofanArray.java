package array;

public class MaximumElementofanArray {
	public static void main(String args[]) {
		
		int n [] = {2,4,6,74,32,8,4};
		
		int max = n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
					max =n[i];
			}
		}
		System.out.println(max);
	}

}
