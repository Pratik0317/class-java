package lunchprob;

import java.util.Scanner;

public class ProgramFunction {

	Scanner scanner = new Scanner(System.in);
	Lunch lunch = new Lunch();
	public void orderLunch() {
		System.out.println("Enter the lunch you want from menu:");
		String itemName = scanner.nextLine();
		System.out.println("Enter the quantity you want:");
		int quantity = scanner.nextInt();
		int price = 0;
		if(!(quantity>lunch.getQuantity())) {
			for(int i = 0;i<quantity;i++) {
				price+=price;
			}
			System.out.println("Total payable amount: "+price);
		}else {
			System.out.println("Not enough quantity left \n please order somthing else: ");
		}
	}
}
