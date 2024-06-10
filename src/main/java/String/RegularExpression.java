package String;

public class RegularExpression {
	public static void main(String args[]) {
		
		//Regular Expression in  STRING
		
		System.out.println("Regular Expression in String");
		
		String str = "T";
		String str1 = "%";
		String str2 = "UI";
		System.out.println("Checking whether it is Single character\n"
				+ str.matches(".")+" " + str1.matches(".")+" "+ str2.matches("."));
		//Exactly Given Letters
		System.out.println("[abc] Exactly Given single Letters");
		String letter = "b";
		System.out.println(letter.matches("[abc]"));
		//Either first or second set
		System.out.println("Either first or second set matches the pattern");
		String set = "at";
		System.out.println(set.matches("[abc][t]"));
		//Except the given values
		System.out.println("Except the given values");
		String not = "c";
		System.out.println(not.matches("[^abc]"));
		//a-z or 1-7
		System.out.println("a-z or 1-7");
		String alpha = "a7";
		System.out.println(alpha.matches("[a-z][1-9]"));
		//A|B
		System.out.println("A|B");
		String or = "k";
		System.out.println(or.matches("a|b"));
		
		
		
	}

}
