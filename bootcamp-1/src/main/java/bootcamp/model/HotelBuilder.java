package bootcamp.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class HotelBuilder {
    private final String destination;
    private final int checkIn;
    private final int checkOut;
    private final int rooms;
    private final int adults;
    private final int children;

    HotelBuilder(String destination, int checkIn, int checkOut, int rooms, int adults, int children) {
        this.destination = destination;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
    }

    public String getDestination() {
        return destination;
    }

    public String getCheckIn() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusDays(checkIn).format(format);
    }

    public String getCheckOut() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusDays(checkOut).format(format);
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

    public static final class Builder {
        private String destination;
        private int checkIn;
        private int checkOut;
        private int rooms;
        private int adults;
        private int children;

        private Builder() {
        }

        public static Builder hotelCriteria() {
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

        public HotelBuilder build() {
            return new HotelBuilder(destination, checkIn, checkOut, rooms, adults, children);
        }
    }
}
