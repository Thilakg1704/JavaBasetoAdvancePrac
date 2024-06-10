package String;

public class StringPrac1 {
	public static void main(String args[]) {
		
		String str1 = "java";
		String str2 = "java";
		 String str3 = new String("java");
		 
		 // check whether the reference and object are same 
		 // checking whether the objects are equal 
		 boolean compare1 = str1.equals(str2);
		 System.out.println(compare1);
		 
		 //checking whether the reference are equal
		if(str1==str2) {
			System.out.println("its equal");
		}
		 // checking whether the reference are equal in heap vs pool
		boolean compare2 = str2.equals(str3);
		System.out.println(compare2);
		
		//checking whether the reference are equal 
		if(str1==str3) {
			System.out.println("it is equal");
		}
		System.out.println("not equal");
	}
	

}
