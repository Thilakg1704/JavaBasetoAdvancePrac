package String;

public class StringMethods {

	public static void main(String[] args) {
		// To find the length of the String
		System.out.println("******Method to find Length of the string*******");
		String name = "Thilak";
		int len = name.length();
		System.out.println(name);
		System.out.println("The length of the name is "+len);
		System.out.println();
		
		// Method to change the String to Uppercase and Lowercase
		// we change it will store it in the new reference
		System.out.println("******Method for upercase and lower case *****");
		String language = "Java Program";
		String lc = language.toLowerCase();
		System.out.println("String to Lower Case :"+ lc);
		String uc = language.toUpperCase();
		System.out.println("String to lower case "+ uc);
		System.out.println();
		
		//Trim Method
		// to trim the unwanted  empty or blank spaces 
		System.out.println("*******Trim method**********");
		String greet = "   Welcome   ";
		System.out.println(greet);
		System.out.println("After trimming the spaces  \n"+greet.trim());
		System.out.println();
		
		//Substring method 
		//it will execute from the index number which have mentioned
		 System.out.println("*******Substring****");
		 //only starting  index is given
		 String sub = "name of the Sub string";
		  String sub2 = sub.substring(4);
		  System.out.println("output starts from the index 4 :"+sub2 );
		  //both starting and ending index is given
		  String sub3 = sub.substring(4, 22);
		  System.out.println("Here we give the value where the it should be started"
		  		+ "and where it should be ended\n " + sub3);
		  
		 //String Replace
		  // it will replace the old char to new char
		  
		  String  eg = "fool";
		  System.out.println("Before Replacing "+ eg);
		  String rp = eg.replace('f', 'c');
		  System.out.println("After replacing "+ rp);
		  
		
		

	}

}
