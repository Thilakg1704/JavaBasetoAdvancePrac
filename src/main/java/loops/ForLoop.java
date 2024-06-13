package loops;

public class ForLoop {
	public static void main(String args[]) {
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		for(int num =10;num>0;num--) {
			System.out.print(num+ " ");
		}
		
		//Entering two variable at a time
		for(int j=0,k=1;j<=10;j++,k*=2) {
			System.out.println(j+" "+k);
		}
	}

}
