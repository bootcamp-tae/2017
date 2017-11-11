package bootcamp.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class FlightBuilder {

    private final String origin;
    private final String destination;
    private final int dateDeparting;
    private final int adults;
    private final int children;


    FlightBuilder(String origin, String destination,int dateDeparting, int adults, int children){
        this.origin=origin;
        this.destination=destination;
        this.dateDeparting=dateDeparting;
        this.adults=adults;
        this.children=children;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateDeparting() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusDays(dateDeparting).format(format);
    }

    public int getAdults() {
        return adults;
    }

    public int getChildren() {
        return children;
    }

    public static final class Builder {


        private String origin;
        private String destination;
        private int dateDeparting;
        private int adults;
        private int children;

        private Builder() {
        }

        public static Builder flightCriteria() {
            return new Builder();
        }

        public Builder setOrigin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDateDeparting(int dateDeparting) {
            this.dateDeparting = dateDeparting;
            return this;
        }

        public Builder setAdults(int adults) {
            this.adults = adults;
            return this;
        }

        public Builder setChildren(int children) {
            this.children = children;
            return this;
        }

        public FlightBuilder build() {
            return new FlightBuilder(origin,destination,dateDeparting,adults,children);
        }

    }


}
