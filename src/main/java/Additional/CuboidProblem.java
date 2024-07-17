package Additional;

import java.util.Scanner;

public class CuboidProblem {
	public static void main(String args[]) {
		int height,length, breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height,length and  breadth of cuboid ");
		height = sc.nextInt();
		length = sc.nextInt();
		breadth = sc.nextInt();
		
		System.out.println("Height: "+height+"\nlength: "+ length+"\nbreadth: "+breadth);
		
		// to find the area
		// Area of front and back side of cuboid
		int area_front_backside = height*length;
		//Area of left and right side of cuboid
		int area_right_leftside = breadth *height;
		//Area of top and bottom  of cuboid
		int area_top_bottom = length*breadth;
		
		System.out.println("Area of front and back side: "+area_front_backside +
				"\nArea of left and right side of cuboid: "+area_right_leftside+
				"\nArea of top and bottom  of cuboid: "+area_top_bottom);
		//volume of cuboid
		int volume = length*breadth*height;
		System.out.println("volume of cuboid: "+volume);
		
		int totalarea = 2*(height*length+breadth *height+length*breadth);
		System.out.println("The total area is "+ totalarea);
		
	}

}
