package Additional;

public class NestedIfElse {
	public static void main (String args[]) {
		
		int i =10;
		
		if(i==10 || i<15) {
			if(i>15) {
				System.out.println(i +"is greater than 15");
			}
			if(i<15) {
				System.out.println(i+" is less than 15");
			}
			else {
				System.out.println("none");
			}
		}
		
	}

}
