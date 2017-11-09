package com.globant.automation.bootcamp.ui.pages.CheapTickets;

public class HotelSearch {

    private String cityDestination;
    private String checkInDate;
    private String checkOutDate;
    private int rooms;
    private int adultPassengers;
    private int childrenPassengers;

    public HotelSearch(String cityDestination, String checkInDate, String checkOutDate, int rooms, int adultPassengers, int childrenPassengers) {
        this.cityDestination = cityDestination;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.rooms = rooms;
        this.adultPassengers = adultPassengers;
        this.childrenPassengers = childrenPassengers;
    }

    public String getCityDestination() {
        return cityDestination;
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
