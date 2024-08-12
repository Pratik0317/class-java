package objectclassdemo;

public class RectangleExecutor {

	public static void main(String[] args) {
		RectangleIO rectangleIO = new RectangleIO();
		RectangleService rectangleService = new RectangleService();
		Rectangle rectangle = rectangleIO.readRectangle();
		
		double area = rectangleService.areaOfRectangle(rectangle);
		double perimeter = rectangleService.perimeterOfRectangle(rectangle);
		
		System.out.println("Area of rectangle is :"+area);
		System.out.println("Perimeter of rectangle is: "+perimeter);
		
		rectangleService.typeOfTriangle(rectangle);
	}
}
