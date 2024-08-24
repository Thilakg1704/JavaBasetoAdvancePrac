package abstracteg;

abstract class Super {
	public Super() {
		System.out.println("Constructor of Super class");
	}
	public void meth1() {
		System.out.println("Super class Meth1 ");
	}
	
	abstract public void meth2();
	
}
class Sub extends Super{
	public void meth2() {
		System.out.println("Overrided Sub method");
	}
}

public class AbstractSample {
	public static void main(String args[]) {
		
		Super su = new Sub();
		su.meth1();
		su.meth2();
		
	}

}
