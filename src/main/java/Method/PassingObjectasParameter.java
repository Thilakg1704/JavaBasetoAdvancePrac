package Method;

public class PassingObjectasParameter {
	
	static void change(int x[], int index, int value) {
		x[index] = value;
	}
		
	public static void main(String args[]) {
		
		int a[] = {1,2,3,4,5};
		System.out.println("Before modifing the object: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		int index = 2;
		int value = 20;
		change(a, index, value);
		System.out.println("\nAfter modifing the object: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		
		
		
		
	}

}
