package objectclassdemo;

public class TriangleService {

	public float calPar(Triangle triangle) {
	
		return triangle.getB()+triangle.getP()+triangle.getH();
	}
	
	public void triangleKind(Triangle triangle) {
		if(triangle.getB()== triangle.getP()&& triangle.getP()== triangle.getH()) {
			System.out.println("The given triangle is equilateral");
		}else if (triangle.getB()==triangle.getP()|| triangle.getP()==triangle.getH()) {
			System.out.println("Given Triangle is isosceles triangle");
		}else if(triangle.getH() == Math.sqrt(triangle.getB()*triangle.getB()+triangle.getP()*triangle.getP())){
			System.out.println("The given triangle is right angled triangle");
			
		}else {
			System.out.println("The given triangle is non of above");
		}
	}
	
	public float area(Triangle triangle) {
		float s = (triangle.getB()+triangle.getP()+triangle.getH())/2;
		return  (float) Math.sqrt(s*(s-triangle.getB())*(s-triangle.getP())*(s-triangle.getH()));
	}
}
