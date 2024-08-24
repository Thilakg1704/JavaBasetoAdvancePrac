package oop;

class Parent1{
	public Parent1() {
		System.out.println("Non-param  Parent Constructor");
	}
	public Parent1(int x) {
		System.out.println("Param parent Constructor ");
	}
}
class Child1 extends Parent1
{
	public Child1() {
		System.out.println("Non param Child Constructor");
	}
	public Child1(int t, int y) {
		super (10);
		System.out.println("Param Child Constructor / super class is used");
	}
	public Child1(int y) {
		
		System.out.println("Param Child Constructor");
	}
}
public class ParamConstructorInherit {
	
	public static void main(String args[]) {
		Child1 c = new Child1(10,20);
	}
}
