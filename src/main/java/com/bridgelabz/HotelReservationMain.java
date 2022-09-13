package com.bridgelabz;

import java.util.Scanner;

public class HotelReservationMain {

	public static void main(String[] args){
		System.out.println("Welcome to Hotel Reservation Program");
		Scanner sc = new Scanner(System.in);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(new Hotel("Lakewood", 110));
		hotelReservation.addHotel(new Hotel("Bridgewood", 160));
		hotelReservation.addHotel(new Hotel("Ridgewood", 220));
	}
}
