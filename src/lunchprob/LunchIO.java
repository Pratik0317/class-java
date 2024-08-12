package lunchprob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LunchIO {

	Scanner scanner = new Scanner(System.in);
	public List<Lunch> readLunch(){
		Lunch lunch = new Lunch();
		List<Lunch> lunchList = new ArrayList<Lunch>();
		for(int i =0;i<5;i++) {
			System.out.println("Enter ");
			lunch.setLunchName(scanner.nextLine());
			lunch.setQuantity(scanner.nextInt());
			lunchList.add(lunch);
		}
		return lunchList;
	}
}
