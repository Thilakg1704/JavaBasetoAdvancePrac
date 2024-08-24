package oop;

class Super1{
	public void display() {
		System.out.println("Super class Display");
	}
}
class Sub extends Super1
{
	@Override
	public void display(){
		System.out.println("Sub class Display");
	}
}
public class MetgodOverride {

	public static void main(String args[]) {
		Super1 v = new Super1();
		Sub su = new Sub();
		v.display();
		su.display();
		
		//Dynamic Dispatch
		Super1 c = new Sub();
		c.display();
		
	}
}
