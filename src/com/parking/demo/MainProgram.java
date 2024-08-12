package com.parking.demo;

import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ParkingFunction parkingFunction = new ParkingFunction();
		int[] parkingSlot = parkingFunction.readParking();
		
		ParkingExecutor prakiExecutor = new ParkingExecutor();
		
		boolean status = true;
		
		//prakiExecutor.park(parkingSlot,userInput );
		
		while(status) {
			System.out.println("Parking Slot Menu"
					+ "\n 1.Available parking slot"
					+ "\n 2.Park"
					+ "\n 3.Unpark"
					+ "\n 4.Booking"
					+ "\n 5.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				prakiExecutor.availableParking(parkingSlot);
				break;
			}
			case 2: {
				System.out.println("Enter the parking number1");
				int userInput = scanner.nextInt();
				prakiExecutor.park(parkingSlot, userInput);
				break;
			}
			case 3: {
				System.out.println("Enter the slot number to unpark");
				int unparkingNumber = scanner.nextInt();
				prakiExecutor.unPark(parkingSlot, unparkingNumber);
				break;
			}
			case 4: {
				System.out.println("Enter the slot number to unpark");
				int bookingNumber = scanner.nextInt();
				prakiExecutor.bookParking(parkingSlot, bookingNumber);
				break;
			}
			case 5: {
				status = false;
				break;
			}
			default:
				System.out.println("Enter a valid number");
			}
		}
		scanner.close();
	}

}
