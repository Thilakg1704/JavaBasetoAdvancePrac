package staticFinal;

// Final Method
 final class test2{
	final public void method1() {
		System.out.println("hello");
	}
}
//class test3 extends test2{ // cannot override final class
//	public void method1() { //cannot override final method
//		
//	}
//}

public class FinalDemo {
	public static void main(String args[]) {
		//Final Variable
		final int s;
		s = 20;
		System.out.println(s*20);
	}
}
