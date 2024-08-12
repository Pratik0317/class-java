package objectclassdemo;

public class TriangleExecutor {

	public static void main(String[] args) {
		 TriangleService triangleService  = new TriangleService();
		 //Triangle triangle = new Triangle();
		 
		 TriangleIO trIo = new TriangleIO();
		 Triangle triangle = trIo.readTriangle();
		 
		 float perimeter = triangleService.calPar(triangle);
		 System.out.println("Perimeter of a triangle is: "+perimeter);
		 
		 triangleService.triangleKind(triangle);
		 
		 float area = triangleService.area(triangle);
		 System.out.println("Area of triangle is: "+area);
	}
}
