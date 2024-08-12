package objectclassdemo;

public class RectangleService {

	public double areaOfRectangle(Rectangle rectangle) {
		return rectangle.getBreadth()*rectangle.getLength(); 
	}
	
	public double perimeterOfRectangle(Rectangle rectangle) {
		return 2*(rectangle.getBreadth()+rectangle.getLength());
	}
	
	public void typeOfTriangle(Rectangle rectangle) {
		
		if(rectangle.getLength()==rectangle.getBreadth()) {
			System.out.println("Given image is square");
		}else {
			System.out.println("It is rectangle");
		}
	}
}
