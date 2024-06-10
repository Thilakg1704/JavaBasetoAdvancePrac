package Additional;

public class RegularExpPrb2 {
	public static void main (String args[]) {
		
		//Remove special Character from String
		String str = "!123@#$12354%^&Ssdf";
		
		System.out.println("Removing special caharcter from String");
		System.out.println(str.replaceAll("[^A-Z a-z 0-9]", ""));
		
		// Remove extra spaces from the String 
		
		String space = " abc         def    ghi   jkl";
		
		System.out.println("Removing extra space from the String");
		space = space.replaceAll("\\s+", " ").trim();
		System.out.println(space);
		
		//To find the number of words
		String words[] =space.split("\\s");
		System.out.println(words.length);
		
	}

}
