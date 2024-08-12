package functions;

import java.util.Scanner;

public class CountWords {
	
	static public int countWordString(String word) {
		int count = 0;
		for(int i = 0; i<word.length();i++) {
			if(word.charAt(i)== ' ') {
				count++;
			}
		}
		return count+1;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any sentences");
		String words = scanner.nextLine();
		
		int count = countWordString(words);
		System.out.println(count);
		scanner.close();
		
	}

}
