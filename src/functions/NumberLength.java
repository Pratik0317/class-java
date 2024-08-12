package functions;

import java.util.Scanner;

public class NumberLength {
	
	static public int countNumber(int number) {
		String numbers = Integer.toString(number);	
		
		return numbers.length();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		int result = countNumber(number);
		System.out.println(result);
		scanner.close();
		
	}

}
