package com.globant.automation.bootcamp.ui.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelSearch {

    //Clase inmutable
    private final String destination;
    private final int checkInDate;
    private final int checkOutDate;
    private final int rooms;
    private final int adultPassengers;
    private final int childrenPassengers;

    public HotelSearch(String destination, int checkInDate, int checkOutDate, int rooms, int adultPassengers, int childrenPassengers) {
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

    public String getCheckIn() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusDays(checkInDate).format(format);
    }

    public String getCheckOut() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusDays(checkOutDate).format(format);
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

    public static final class Builder {
        private String destination;
        private int checkIn;
        private int checkOut;
        private int rooms;
        private int adults;
        private int children;

        /**
         * Clase anonima, aplicando patron Builder la cual me permite crear un Objeto tipo
         * HotelSearch sin la necesidad de utilizar todos sus atributos
         */
        private Builder() {
        }

        public static Builder aHotelSearch() {
            return new Builder();
        }

        public Builder withDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder withCheckIn(int checkIn) {
            this.checkIn = checkIn;
            return this;
        }

        public Builder withCheckOut(int checkOut) {
            this.checkOut = checkOut;
            return this;
        }

        public Builder withRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder withAdults(int adults) {
            this.adults = adults;
            return this;
        }

        public Builder withChildren(int children) {
            this.children = children;
            return this;
        }

        public HotelSearch build() {
            return new HotelSearch(destination, checkIn, checkOut, rooms, adults, children);
        }
    }
}
