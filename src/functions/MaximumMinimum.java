package functions;

import java.util.Scanner;

public class MaximumMinimum {
	Scanner scanner = new Scanner(System.in);
	public Number readNumber() {
		System.out.println("Enter any three number: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		Number number = new Number(num1, num2, num3);
		 return number;
	}
	
	public int maxNumber(Number number) {
		int maxNumber = 0;
		if(number.getNum1()>=number.getNum2()&&number.getNum2()>=number.getNum3()) {
			maxNumber = number.getNum1();
		}else if(number.getNum2()>=number.getNum1()&&number.getNum2()>=number.getNum3()){
			maxNumber = number.getNum2();
		}else {
			maxNumber = number.getNum3();
		}
		
		return maxNumber;
		
	}
	
	public int minNumber(Number number) {
		int minNumber = 0;
		if(number.getNum1()<=number.getNum2()&&number.getNum2()<=number.getNum3()) {
			minNumber = number.getNum1();
		}else if(number.getNum2()<=number.getNum1()&&number.getNum2()<=number.getNum3()){
			minNumber = number.getNum2();
		}else {
			minNumber = number.getNum3();
		}
		
		return minNumber;
		
	}
	
	public static void main(String[] args) {
		
		MaximumMinimum maxMin = new MaximumMinimum();
		Number num = maxMin.readNumber();
		
		int max = maxMin.maxNumber(num);
		System.out.println("Maximum number is: "+max);
		int min = maxMin.minNumber(num);
		System.out.println("Minimun number: "+min);
	}
}
