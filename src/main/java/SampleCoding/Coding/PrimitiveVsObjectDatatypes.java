package SampleCoding.Coding;

import java.util.Arrays;

public class PrimitiveVsObjectDatatypes {
	public static void main (String args[]) {
		// Primitive data types
		int x = 10;
		int y = x;
		System.out.println("Print initially");
		System.out.println(" value of X "+ x +" "+ "value of y "+ y);
		System.out.println(" changing the value of y");
		y=30;
		System.out.println("After changing the value ");
		System.out.println(" value of X "+ x + "value of y "+ y);
		
		System.out.println("*********Object data type ********");
		int  arr [] = {10,20,30,40,50, 60};
		System.out.println("Assigning the value of arr to arr1");
		int arr1[] = arr;
		System.out.println(" The initial values are ");
		System.out.println("The value of arr is "+ Arrays.toString(arr) 
				+ "The value of arr1" + Arrays.toString(arr1));
		System.out.println("Changing the value of arr1 of index");
		arr1[1] = 100;
		System.out.println("The value of arr is "+ Arrays.toString(arr) 
				+ "The value of arr1" + Arrays.toString(arr1));
	// here in the object data type it will affect the original value
		
		
		
	}

}
