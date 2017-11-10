import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class Search {
    private final String cityDestination;
    private final int dateCheckIn;
    private final int dateCheckOut;
    private final int rooms;
    private final int adults;
    private final int children;

    public Search(String cityDestination, int dateCheckIn, int dateCheckOut, int rooms, int adults, int children) {
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
        /*DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusDays(dateCheckIn).format(format);*/
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

    public static final class Builder{
        private final String cityDestination;
        private final int dateCheckIn;
        private final int dateCheckOut;
        private final int rooms;
        private final int adults;
        private final int children;
    }

    private Builder
}
