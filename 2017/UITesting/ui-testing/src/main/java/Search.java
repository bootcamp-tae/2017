

public final class Search {
    private final String cityDestination;
    private final String dateCheckIn;
    private final String dateCheckOut;
    private final String rooms;
    private final String adults;
    private final String children;

    public Search(String cityDestination, String dateCheckIn, String dateCheckOut, String rooms, String adults, String children) {
        this.cityDestination = cityDestination;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public String getDateCheckIn() {
        return dateCheckIn;
    }

    public String getDateCheckOut() {
        return dateCheckOut;
    }

    public String getRooms() {
        return rooms;
    }

    public String getAdults() {
        return adults;
    }

    public String getChildren() {
        return children;
    }
}
