package com.bridgelabz;

import java.util.*;

public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

    boolean addHotel(Hotel hotel){
        hotelList.add(hotel);
        return true;
    }
}
