package SampleCoding.Coding;

import java.io.*;
		
	// Getting input from user using bufferedReader class 
	

public class BufferedReaderClass {

	public static void main(String[] args) throws IOException
	{
		//creating Buffered Reader object
		// InputStreamReader is used to convert bytes to
		// Stream of character
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		//String reading internally
		String str = bfn.readLine();
		
		System.out.println("Enter your age");
		// integer reading internally
		int it = Integer.parseInt(bfn.readLine());
		
		System.out.println("The entered name is :" + str);
		System.out.println("The entered age is :" + it);
		
		
		 
		
		
	
	}

}
