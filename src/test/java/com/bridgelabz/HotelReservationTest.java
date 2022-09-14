package com.bridgelabz;

import org.junit.*;

public class HotelReservationTest {

	static HotelReservation hotelReservation;

	@Before
	public void initialize() {
		 hotelReservation = new HotelReservation();
	     hotelReservation.addHotel(new Hotel("Lakewood", 110, 80, 90, 80, 3));
	     hotelReservation.addHotel(new Hotel("Bridgewood", 150, 110, 60, 50, 4));
	     hotelReservation.addHotel(new Hotel("Ridgewood", 220, 100, 150, 40, 5));
	    }

	    @Test
	    public void addHotelList() {
	        boolean result = hotelReservation.addHotel(new Hotel("Lakewood", 110, 80, 90, 80, 3));
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void getCheapestHotel() {
	        Hotel hotel = hotelReservation.getCheapestBestRatedHotel("23-05-2022", "27-05-2022",false);
	        Assert.assertEquals("Lakewood", hotel.getName());
	    }

	    @Test
	    public void weekendCheapestHotel() {
	        Hotel hotel = hotelReservation.getCheapestBestRatedHotel("28-05-2022", "29-05-2022",false);
	        Assert.assertEquals("Bridgewood", hotel.getName());
	    }

	    @Test
	    public void getCheapestBestRatedHotel() {
	        Hotel hotel = hotelReservation.getCheapestBestRatedHotel("23-05-2022", "31-05-2022",false);
	        Assert.assertEquals("Bridgewood", hotel.getName());
	    }

	    @Test
	    public void getBestRatedHotel() {
	        Hotel hotel = hotelReservation.getBestRatedHotel();
	        Assert.assertEquals("Ridgewood", hotel.getName());
	    }

	    @Test
	    void rewardedCustomersReturn_CheapestHotel() {
	        Hotel hotel = hotelReservation.getCheapestBestRatedHotel("28-05-2022", "29-05-2022",true);
	        Assert.assertEquals("Ridgewood", hotel.getName());
	    }
	}

