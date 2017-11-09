package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe;

/**
 * Created by yo on 8/11/2017.
 */
public final class HotelForm {
    private final String destination;
    private final String checkIn;
    private final String chekOut;
    private final int rooms;
    private final int adults;
    private final int children;

    public HotelForm(String destin, String chIn, String chOut, int rmms, int adlts, int childrn){
        this.destination = destin;
        this.checkIn = chIn;
        this.chekOut = chOut;
        this.rooms = rmms;
        this.adults = adlts;
        this.children = childrn;
    }

    public String getDestination() {
        return destination;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getChekOut() {
        return chekOut;
    }

    public int getRooms() {
        return rooms;
    }

    public int getAdults() {
        return adults;
    }

    public int getChildren() {
        return children;
    }
}
