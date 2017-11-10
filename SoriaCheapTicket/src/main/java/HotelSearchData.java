import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class HotelCriteria {
    private final String destination;
    private final int checkIn;
    private final int checkOut;
    private final int rooms;
    private final int kids;
    private final int adults;

    private HotelCriteria(String destination, int checkIn, int checkOut, int rooms, int kids, int adults){
        this.kids = kids;
        this.adults = adults;
        this.rooms = rooms;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.destination = destination;
    }

    public int getRooms() {
        return rooms;
    }

    public int getAdults() {
        return adults;
    }

    public int getKids() {
        return kids;
    }

    public String getCheckIn() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        return LocalDate.now().plusDays(checkIn).format(format);
    }

    public String getCheckOut() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        return LocalDate.now().plusDays(checkOut).format(format);
    }

    public  String getDestination() {
        return destination;
    }

    public static final class Builder{
        private String destination;
        private int checkIn;
        private int checkOut;
        private int rooms;
        private int adults;
        private int childrens;

        private Builder(){

        }

        public static Builder anHotelCriteria(){
            return new Builder();
        }

        public Builder withDestination(String destination){
            this.destination = destination;
            return this;
        }

        public Builder withCheckIn(int checkIn){
            this.checkin = checkIn;
            return this;
        }

        public Builder withCheckOut(int checkOut){
            this.checkout = checkOut;
            return this;
        }

        public Builder withRooms(int rooms){
            this.rooms = rooms;
            return this;
        }

        public Builder withAdults(int adults){
            this.adults = adults;
            return this;
        }

        public Builder withChildren(int childrens){
            this.childrens = childrens;
            return this;
        }

        public HotelCriteria build(){
            return new HotelCriteria(destination,checkIn,checkOut,rooms,adults,childrens);
        }
    }

}
