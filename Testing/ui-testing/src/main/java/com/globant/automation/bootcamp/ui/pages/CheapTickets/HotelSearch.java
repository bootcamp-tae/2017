package com.globant.automation.bootcamp.ui.pages.CheapTickets;

public class HotelSearch {

    private final String destination;
    private final String checkInDate;
    private final String checkOutDate;
    private final int rooms;
    private final int adultPassengers;
    private final int childrenPassengers;

    public HotelSearch(String destination, String checkInDate, String checkOutDate, int rooms, int adultPassengers, int childrenPassengers) {
        this.destination = destination;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.rooms = rooms;
        this.adultPassengers = adultPassengers;
        this.childrenPassengers = childrenPassengers;
    }

    public String getDestination() {
        return destination;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public int getRooms() {
        return rooms;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public int getChildrenPassengers() {
        return childrenPassengers;
    }
}
