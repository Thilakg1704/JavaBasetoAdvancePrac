package Method;

public class VariableArgument {
	
	static void show(int ...x) {
		for(int a:x) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	static void showList(String ...s) {
		for(int i=0;i<s.length;i++) {
			System.out.println(i+1+". "+s[i]);
		}
	}
	
	public static void main(String args[]) {
		
		show(0);
		show(10,20,30);
		show(new int [] {1,2,3,4,5,6,7});
		
		showList("Thilak", "GTk","Maya","Karthik");
	}

}
