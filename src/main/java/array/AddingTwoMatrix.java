package array;

public class AddingTwoMatrix {
	public static void main(String args[]) {
		//adding two matrix
		int a[][] = {{1,2,3},{4,5,6},{7,3,2}};
		int b[][] = {{1,2,3},{4,5,6},{7,3,2}};
		int c[][]= new int [3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]= a[i][j]*b[i][j];
				
			}
		}
		for(int x[]:c)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
