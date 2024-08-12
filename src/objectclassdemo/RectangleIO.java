package objectclassdemo;

import java.util.Scanner;

public class RectangleIO {
	
	Scanner scanner = new Scanner(System.in);
	
	public Rectangle readRectangle() {
		System.out.println("Enter the length and breadth of rectangle: ");
		double length = scanner.nextDouble();
		double breadth = scanner.nextDouble();
		
		
		Rectangle rectangle = new Rectangle(length, breadth);
		
		return rectangle;
		
	}
}
