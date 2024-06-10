package String;

public class Quantifiers {
	public static void main(String args []) {
		//Quantifiers
		/*  "*"  - 0 or  more time
		 *  "+"  - 1 or more time
		 *  "?"  - 0 or 1 time
		 *  {x}  - X times
		 *  {x,y}- Between 
		 * */
		String str = "thilakg";
		System.out.println(str.matches("\\w*"));
		System.out.println(str.matches(".*"));
		System.out.println(str.matches("[a-z]*"));
		System.out.println(str.matches("[a-z]{4}"));
		System.out.println(str.matches("[a-z]{4,7}"));
		
		//Validation
		System.out.println("Validation:");
		 String email = "thilak17@gmail.com";
		 System.out.println(email.matches("\\w*@gmail.*"));
		
		
	}

}
