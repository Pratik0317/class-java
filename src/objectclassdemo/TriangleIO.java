package objectclassdemo;

import java.util.Scanner;

public class TriangleIO {
	
	Scanner scanner = new Scanner(System.in);
	public Triangle readTriangle() {
		float b = scanner.nextFloat();
		float p = scanner.nextFloat();
		float h = scanner.nextFloat();
		
		Triangle triangle = new Triangle(b,p,h);
		return triangle;
	}
}
