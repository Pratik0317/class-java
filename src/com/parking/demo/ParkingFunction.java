package com.parking.demo;

import java.util.Scanner;

public class ParkingFunction {
	Scanner scanner = new Scanner(System.in);
	
	public int[] readParking() {
		System.out.println("Enter the size of your parking");
		int parkingSize = scanner.nextInt();
		int[] parkingSlot = new int[parkingSize];
		System.out.println("Enter 1 if parking is available, 0 if parking is not available.");
		for(int i =0;i<parkingSize;i++) {
			parkingSlot[i] = scanner.nextInt();
		}
		return parkingSlot;

	}
	
}
