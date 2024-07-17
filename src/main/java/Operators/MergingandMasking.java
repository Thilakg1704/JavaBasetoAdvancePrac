package Operators;

public class MergingandMasking {
	public static void main(String args[]) {
		
		int a=8;
		int b=64;
		int z= a|b;
		System.out.println(z);
		//masking
		
		byte num1= 5;
		byte num2 = 12;
		
		byte c = (byte)(num1<<4);
		c = (byte)(c|num2);
		System.out.println("The value of c is: "+c);
		System.out.println((c&0b11110000)>>4);
		System.out.println(c&0b00001111);
		
	}

}
