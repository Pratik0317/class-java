package com.parking.demo;

public class ParkingExecutor {

	public void availableParking(int[] parkingSlot) {
		for(int i=0;i<parkingSlot.length;i++) {
			if(parkingSlot[i]==0) {
				System.out.println("Available parkiing at: "+(i+1));
			}
		}
	}
	public void park(int[] parkingSlot, int parkingNumber) {
			if(parkingSlot[(parkingNumber-1)] == 0) {
				parkingSlot[(parkingNumber-1)] = 1;
				System.out.println("Parking Successfull");
			}else {
				System.out.println("Failed to park!!");
			}
	}
	
	public void unPark(int[] parkingSlot, int parkingNumber) {
			if(parkingSlot[(parkingNumber-1)] == 1) {
				parkingSlot[(parkingNumber-1)] = 0;
				System.out.println("Unparking Successfull");
			}else {
				System.out.println("Failed to Unpark!!");
			}
	}
	
	public void bookParking(int[] parkingSlot,int userInput) {
			if(parkingSlot[(userInput - 1)]==0) {
				parkingSlot[(userInput-1)] = 1;
				System.out.println("Booking Successfull!!");
			}else {
				System.out.println("Failed to Book!!");
			}
		}
	
}

