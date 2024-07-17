package array;

public class TwoDimensionalArrayPrac {
	public static void main(String args[]) {
		
		int arr[][] ;
		arr = new int [4][5];
		
		for(int x[]:arr) {
			for(int y:x) {
				System.out.print(y);
			}
			System.out.println();
		}
		int a [][]= {{1,2,3,4},{4,5,6,7},{8,9,10,11}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
