package com.bridgelabz;

import org.junit.*;

public class HotelReservationTest {

	static HotelReservation hotelReservation;

	@Before
	public void initialize() {
		hotelReservation = new HotelReservation();
		hotelReservation.addHotel(new Hotel("Lakewood", 110, 90, 3));
		hotelReservation.addHotel(new Hotel("Bridgewood", 160, 50, 4));
		hotelReservation.addHotel(new Hotel("Ridgewood", 220, 150, 5));
	}

	@Test
	public void addHotel() {
		boolean result = hotelReservation.addHotel(new Hotel("Lakewood", 110, 90, 3));
		Assert.assertTrue(result);
	}

	@Test
	public void addWeekend_weekday() {
		Hotel hotel = hotelReservation.getCheapestBestRatedHotel("28-05-2022", "29-05-2022");
		Assert.assertEquals("Bridgewood", hotel.getName());
	} 

	@Test
	public void customerShould_getBestRatedHotel() {
		Hotel hotel = hotelReservation.getBestRatedHotel();
		Assert.assertEquals("Ridgewood", hotel.getName());
	}

}

