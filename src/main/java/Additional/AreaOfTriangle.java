package Additional;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		//To find Area of the triangle
		// formula Area = (1/2)*base * height
		/* char n ='n';
		Scanner scan = new Scanner(System.in);
		System.out.println("To find the Area of the Triangle "
				+ "we need some of the values");
		System.out.println("Enter the Value of Base "
				+ "if you doesnt have the value enter n");
		float base = scan.nextFloat();
		if(base == n) {
			System.out.println("Enter the next value");
			
		}
		System.out.println("Enter the value of Height");
		float height = scan.nextFloat();
		if(height == n) {
			System.out.println("Enter the next value");
			
		}
		System.out.println("Enter the value of Area");
		float Area = scan.nextFloat();
		if(Area == n) {
			System.out.println("The area of the Triangle is:");
			
		}
		 Area = (1/2) * base * height;
		 System.out.println(Area); */
		
		float base, height, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vakue of base and Height ");
		
		base = sc.nextFloat();
		height = sc.nextFloat();
		
		area = base * height/2;
		System.out.println("Area of Triangle is : "+  area);
		
		
	}

}
