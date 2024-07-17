package array;

public class SortingArray {
	public static void main(String args[]) {
		
		String arr [] = {"java","python","ruby","c","c++"};
		java.util.Arrays.sort(arr);
		for(String x: arr) {
			System.out.println(x);
		}
	}

}
