package com.bridgelabz;

import org.junit.*;

public class HotelReservationTest {

	static HotelReservation hotelReservation;

	@Before
	public void initialize() {
		hotelReservation = new HotelReservation();
		hotelReservation.addHotel(new Hotel("Lakewood", 110));
		hotelReservation.addHotel(new Hotel("Bridgewood", 160));
		hotelReservation.addHotel(new Hotel("Ridgewood", 220));
	}

	@Test
	public void addHotel() {
		boolean result = hotelReservation.addHotel(new Hotel("Lakewood", 110));
		Assert.assertTrue(result);
	}

	@Test
	public void getCheapestHotel() {
		Hotel hotel = hotelReservation.getCheapestHotel("23-05-2022", "31-05-2022");
		Assert.assertEquals("Lakewood", hotel.getName());
	}

}

