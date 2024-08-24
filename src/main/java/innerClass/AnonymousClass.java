package innerClass;

abstract class test{
	abstract public void display();
}
class out{
	public void meth() {
		
		test t = new test() 
{public void display() {System.out.println("hello this is anonymous class");}};
	
t.display();
	}

}

public class AnonymousClass {
	public static void main(String args[]) {
		out o = new out();
		o.meth();
	}
}
