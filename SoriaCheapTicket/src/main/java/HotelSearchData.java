
public final class HotelSearchData {
    private final static String location = "Mar del plata";
    private final static String checkin = "12/07/2012";
    private final static String checkout = "25/09/2014";
    private final static int rooms = 3;
    private final static int kids = 3;
    private final static int adults = 4;

    public static int getRooms() {
        return rooms;
    }

    public static int getAdults() {
        return adults;
    }

    public static int getKids() {
        return kids;
    }

    public static String getCheckin() {
        return checkin;
    }

    public static String getCheckout() {
        return checkout;
    }

    public static String getLocation() {
        return location;
    }
}
