package Additional;

public class RegularExpPrb1 {
	public static void main(String args[]) {
		//Find if a number is Binary or Not
	
		
		int i = 1000111;
		
		String str = i + "";
		System.out.println(str);
		System.out.println(str.matches("[01]*"));
		
		//To find the number is Hexadecimal
		System.out.println("to check the number is hexadecimal or not");
		String hd = "B234F0";
		System.out.println(hd.matches("[0-9 A-F]+"));
		
		//To find the Date format using Regular Expression
		
		String date = "01/12/2000";
		System.out.println(date.matches("[0-3][0-9]/[01][0-2]/[0-9]{4}"));
	}

}
