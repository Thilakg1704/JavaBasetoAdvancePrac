package String;

public class StringMethosPart3 {
	public static void main(String args[]) {
		//String methods
		
		//Method boolean -  equals
		
		System.out.println("*****Method equals****");
		
		String str1 = "JAVA";
		String str2 = "java";
		String str3 = "language";
		String str4 = "language";
		
		boolean equalsCheck = str3.equals(str4);
		System.out.println("Equals method - it will check whether both"
				+ " the String are same\n"
				+ equalsCheck);
		
		// Method equalIngnoranceCase(String s)
		System.out.println("*****Method equalIgnoreCase*******");
		boolean equalCheck2 = str1.equals(str2);
		System.out.println( "String 1: "+str1+" String 2: "+str2+" \nHere we checking botn the String are same");
		System.out.println("is String 1 is equal to String 2 \n ans: "+ equalCheck2);
		//to ignore the case comparison we use the method
		//Method equalIgnoranceCase 
		boolean equalIgnorecasecheck = str1.equalsIgnoreCase(str2);
		System.out.println( "String 1: "+str1+" String 2: "+str2+" \nHere we checking botn the String are same");
		System.out.println(equalIgnorecasecheck + " ---used equalIgnoreMethod");
		
		//Method int - compareto 
		// it compares the string using dictionary values 
		System.out.println("*******Method compareto******");
		
		int compareCheck = str2.compareTo(str4);
		int compareCheck2 = str4.compareTo(str2);
		System.out.println("Method compare the values and leave the results in int values");
		System.out.println("String2 "+str2+" compared to String4"+str4);
		System.out.println(compareCheck);
		System.out.println(compareCheck2);
	}

}
