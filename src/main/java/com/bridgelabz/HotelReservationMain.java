package com.bridgelabz;

import java.util.Scanner;

public class HotelReservationMain {

	public static void main(String[] args){
		System.out.println("Welcome to Hotel Reservation Program");
		Scanner sc = new Scanner(System.in);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(new Hotel("Lakewood", 110, 90, 3));
		hotelReservation.addHotel(new Hotel("Bridgewood", 160, 50, 4));
		hotelReservation.addHotel(new Hotel("Ridgewood", 220, 150, 5));

		System.out.println("Enter check-in date: (dd-mm=yyyy)");
		String checkInDate = sc.nextLine();
		System.out.println("Enter check-out date: (dd-mm=yyyy)");
		String checkOutDate = sc.nextLine();
		Hotel cheapestHotel = hotelReservation.getCheapestBestRatedHotel(checkInDate, checkOutDate);
		 System.out.println("Cheapest Hotel: " + cheapestHotel.getName() + ", Ratings : " + cheapestHotel.getRatings() + ", Total Cost: " + cheapestHotel.getTotalCost());
    }

}

