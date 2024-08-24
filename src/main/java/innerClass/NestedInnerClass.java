package innerClass;

class Outer{
	int  x= 10;
	
	class Inner{
		int y =20;
		
		void innerDisplay() {
			System.out.println("Inner class");
			System.out.println(x);
			System.out.println(y);
		}
	}
	void outerDispaly() {
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	}
}

public class NestedInnerClass {
	public static void main(String args[]) {
		Outer o = new Outer();
		o.outerDispaly();
		//To access Inner class
		Outer.Inner oi = new Outer().new Inner();
		System.out.println("Inner main display");
		System.out.println(oi.y);
	}
}
