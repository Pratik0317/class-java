package functions;

import java.util.Scanner;

public class MainProgarm {

	public static void main(String[] args) {
		ProgarmFunctions pf = new ProgarmFunctions();
		Scanner scanner = new Scanner(System.in);
		 
		
		  pf.display(); 
		  int result = pf.getTotal(3, 4); 
		  System.out.println(result);
		  
		  // product qn.3 
		  System.out.println("Please enter any number:"); 
		  int x =scanner.nextInt(); 
		  System.out.println("Please enter any number:"); 
		  int y = scanner.nextInt();
		  
		  int mul= pf.mul(x, y);
		  
		  System.out.println("product of two numbers are: "+mul);
		  
		  //area and circumference of circle
		  
		  float area = pf.areaOfCircle(x); 
		  
		  float circum = pf.circumference(x);
		  
		  System.out.println("Area of circle is"+area+"\nCircumference: "+circum);
		  
		  //voting eligible or not
		  
		  System.out.println("Enter your age: "); 
		  int age = scanner.nextInt(); 
		  String message = pf.eligilible(age); 
		  System.out.println(message);
		  
		  //factorial 
		  int facto = pf.getFactorial(y);
		  System.out.println("Factorial of "+y+" is: "+facto);
		  
		  //largest and lowest number 
		  
		  pf.averageNumber(4, 0, 5);
		  
		  int sum = pf.sum(2, 3, 4); 
		  System.out.println("Sum of numbers is :"+sum);
		  
		  //display number from range 
		  pf.displayNumber(1, 10);
		  
		  //prime number 
		  boolean status = pf.checkPrime(5); 
		  if(status == true) {
		  System.out.println("The given number is primary number"); 
		  }
		  
		  //display prime number from 1 - 1000 
		  pf.displayPrime();
		 
		//multiplication table 
		System.out.println("Enter your number");
		int number = scanner.nextInt();
		pf.printMultiplication(number);
		
		scanner.close();
		

	}
}

