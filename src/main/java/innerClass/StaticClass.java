package innerClass;

class sample{
	int x =10;
	static int y =20;
	
	static class stat{
		public void my() {
//			System.out.println(x);//  in static class can't take non-static variable
			System.out.println(y);
		}
	}
	
}

public class StaticClass {
	public static void main(String args[]) {
		
		sample.stat m = new sample.stat();	
		m.my();
	}
}
