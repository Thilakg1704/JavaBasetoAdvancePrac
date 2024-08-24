package oop;

class Rectangle4{
	int length;
	int breadth;
	
	public Rectangle4() {
		length = breadth =2;
		
	}
	public Rectangle4(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}

class Cuboid extends Rectangle4
{
	int height;
	public Cuboid() {
		height =2;
	}
	public Cuboid(int l, int b, int h) {
		super(l,b);
		height =h;
	}
	public Cuboid(int height) {
		this.height= height;
	}
	public int   volume() {
		return length*breadth*height;
	}
}
public class SuperConst {
	public static void main(String args[]) {
		
		Cuboid Cu = new Cuboid(5,3,10);
		System.out.println(Cu.volume());
	}

}
