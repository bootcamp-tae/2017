package com.globant.automation.bootcamp.ui.cheaptickets.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class FlightCriteria {

    private final String flyingFrom;
    private final String flyingTo;
    private final int departing;
    private final int returning;
    private final int adults;
    private final int children;

    private FlightCriteria(String flyingFrom, String flyingTo, int departing, int returning, int adults, int children) {
        this.flyingFrom = flyingFrom;
        this.flyingTo = flyingTo;
        this.departing = departing;
        this.returning = returning;
        this.adults = adults;
        this.children = children;
    }

    public String getFlyingFrom()
    {
        return this.flyingFrom;
    }

    public String getFlyingTo()
    {
        return this.flyingTo;
    }

    public String getDeparting() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusDays(this.departing).format(format);
    }

    public String getReturning() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusDays(this.returning).format(format);
    }

    public int getAdults() {
        return this.adults;
    }

    public int getChildren() {
        return this.children;
    }

    public static final class Builder {

        private String flyingFrom;
        private String flyingTo;
        private int departing;
        private int returning;
        private int adults;
        private int children;

        private Builder() {
        }

        public static Builder aFlightCriteria() {
            return new Builder();
        }

        public Builder withFlyingFrom(String flyingFrom) {
            this.flyingFrom = flyingFrom;
            return this;
        }

        public Builder withFlyingTo(String flyingTo) {
            this.flyingTo = flyingTo;
            return this;
        }

        public Builder withDeparting(int departing) {
            this.departing = departing;
            return this;
        }

        public Builder withReturning(int returning) {
            this.returning = returning;
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

        public FlightCriteria build() {
            return new FlightCriteria(flyingFrom, flyingTo, departing, returning, adults, children);
        }
    }
}
