package array;

public class TwoDimentionalArray {

	public static void main(String[] args) {
				//two Dimensional array
		
		int a[][]= new int [3][4];
		
//		for(int i =0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y);
			}
		}System.out.println("");
	}

}
