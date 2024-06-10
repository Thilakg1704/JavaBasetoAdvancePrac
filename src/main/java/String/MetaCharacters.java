package String;

public class MetaCharacters {
	public static void main(String args[]) {
		
		String str = "5";
		System.out.println("to check whether it is a Digit: \n"
				+str.matches("\\d"));// if single "\"its  for escape character
		System.out.println("to check whether it is not a Digit \n"
				+ str.matches("\\D"));
		System.out.println("to check whether it has a space \n"
				+ str.matches("\\s"));
		System.out.println("to check whether it has no space \n"
				+ str.matches("\\S"));
		System.out.println("to check whether it has Alphabet or digit \n"
				+ str.matches("\\w"));
		System.out.println("to check whether it has  no Alphabet or digi \n"
				+ str.matches("\\W"));
		
	}
	

}
