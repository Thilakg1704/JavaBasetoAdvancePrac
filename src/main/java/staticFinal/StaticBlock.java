package staticFinal;

public class StaticBlock {
	
	static {
		System.out.println("static block 1");
	}
	public static void main(String args[]) {
	
		System.out.println("main");
	}
	static {
		System.out.println("Static block2");
	}
	

}
