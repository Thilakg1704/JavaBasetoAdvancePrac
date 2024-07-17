package Operators;

public class BitwiseOperator {
	public static void main(String args[]) {
		
//		int x= 10, y = 6, z;
		//binary form
		int x = 0b1010;
		int y = 0b0110;
		int z;
		int u = -10;
	
		
		z= x&y;
		System.out.println("AND: "+z);
		z=x|y;
		System.out.println("OR: "+z);
		z=~x;
		System.out.println("XOR: "+z);
		z=x<<1;
		System.out.println("Left shift: "+z);
		z=x>>1;
		System.out.println("Right shift: "+z);
		z=u>>>1;
		System.out.println("Unassigned right shift: "+z);
	}

}
