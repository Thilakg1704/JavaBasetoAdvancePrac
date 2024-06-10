package String;

public class StringEx {
	public static void main(String args[]) {
		
		char [] a = {'A','B','C','D'};
		System.out.println(a);
		String s = new String(a);
		System.out.println(a);
		
		byte []b = {65,66,67,68};
		
		String str = new String(b,1,2); // First index only two letters
		System.out.println(str);
		
		// if the object name is same for the both the reference
		//then its equal
		
		String str1 = "Java";
		String sr = "Java";
		System.out.println(str1 == sr);
		String str2 = "Java";
		String sr1 = new String("Java");//Heap memory // will allocate separate object
		System.out.println(str2 == sr1);
		
		
		
	}

}
