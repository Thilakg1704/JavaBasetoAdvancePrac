package String;

public class StringMethodsPart2 {
	public static void main(String args[]) {
		
		// Here is the continue of the String methods
		// for the previous method refer to className - StringMethods
		
		// Method - Boolean Start with
		System.out.println("*****Boolean Method starts with and Ends with******");
		String browse = "www.google.com";
		boolean checkStart = browse.startsWith("www.");
		//boolean value check true or false
		System.out.println("Check whether it is website or not "
				+ "by checking whether it starts with www.\n"+ checkStart);
		boolean checkEnd = browse.endsWith(".in");
		System.out.println("to check whether it starts with .com\n" + checkEnd);
		System.out.println();
		//Method - char- charAt()
		// to check the character from the particular index
		String name = "Maya Karthik";
		int len = name.length();
		char cha1 = name.charAt(7);
		char cha = name.charAt(len -3);
		System.out.println("to find the particular character from the index "
				+ cha );
		System.out.println(cha1);
		System.out.println();
		
		// Method -int - indexOf(String s) and lastIndexOf(String s)
		//indexOf - it searches from  Left to right
		// it will find the index number
		
		String website = "www.Atinfotech.com";
		
		int  ind = website.indexOf("At");
		System.out.println("Index of at is :"+ ind);
		int find = website.indexOf('.',4);
		System.out.println("left to right "+"Find the index value of '.' after the index 4 "+ find );
		
		//lastIndexOf -  it finds the index from right to left
		
		int find2 = website.lastIndexOf('.',4);
		System.out.println("right to left"+" Find the index value of '.' after the index 4 "+ find2 );

		
		
		
		
		
	}

}
