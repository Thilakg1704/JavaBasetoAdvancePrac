package array;

public class SearchinganElement {

	public static void main(String[] args) {
			//Searching an Element
		
		int array[] = {2,4,5,6,7,8,9,3};
		
		int search = 5;
		for(int i =0;i<array.length;i++) {
			if(search == array[i]) {
				System.out.println("Element Index is :"+i);
				System.exit(0);
			}
			
		}
		System.out.println("Not found");
		
	}

}
