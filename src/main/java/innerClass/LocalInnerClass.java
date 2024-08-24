package innerClass;

class Outer1{
	
	public void outerDisplay1() {
		class Inner1{
			public void innerDisplay() {
				System.out.println("Hello");
			}
		}
//		Inner1 n = new Inner1();
//		n.innerDisplay();
		new Inner1().innerDisplay();// anonymous Object
	}
}
public class LocalInnerClass {
	public static void main(String args[]) {
		
		Outer1 u = new Outer1();
		u.outerDisplay1();
		
		
	}
}
