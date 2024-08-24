package interfaceSample;

interface Test{
	
	public void meth1();
	public void meth2();
}

class My implements Test{
	
	public void meth1() {
		System.out.println("Method 1 of class My");
	}
	public void meth2() {
		System.out.println("Method 2 of class My");
	}
	public void meth3() {
		System.out.println("Method 3 of class My");
	}
}

public class InterfacePractice {
	
	public static void main(String args[]) {
		
		Test t = new My();
		t.meth1();
		t.meth2();
	}

}
