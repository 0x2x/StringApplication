package org.pluralsight.WeekFour.HotelOperations.models;

public class Reserveration {

    public  int getNumberOfNights() {
        return  NumberOfNights;
    }

    public  void setNumberOfNights(int numberOfNights) {
        Price = Price * numberOfNights;
        NumberOfNights = numberOfNights;
    }

    public  void setIsWeekend(boolean isWeekend) {
        if(isWeekend) {
            Price += Price * 0.10; // add 10%
        }
        this.isWeekend = isWeekend;
    }

    public  int getReservationTotal() {
        return ReservationTotal;
    }

    public  void setReservationTotal(int reservationTotal) {
        this.ReservationTotal = reservationTotal;
    }

    public  String getRoomType() {
        return RoomType;
    }

    public  void setRoomType(String roomType) {
        if(roomType.equalsIgnoreCase("king")) {
            Price += 139;
        } else if(roomType.equalsIgnoreCase("double")) {
            Price += 124;
        }
        RoomType = roomType;
    }

    public  double getPrice() {
        return Price;
    }

    private  int NumberOfNights;
    private  boolean isWeekend;
    private  int ReservationTotal;
    private  String RoomType;

    public void setPrice(double price) {
        Price = price;
    }

    private  double Price;


    public Reserveration() {}
    public Reserveration(int NumberOfNights, boolean isWeekend, int ReservationTotal, String RoomType, double Price) {
        this.NumberOfNights = NumberOfNights;
        this.isWeekend = isWeekend;
        this.ReservationTotal = ReservationTotal;
        this.RoomType = RoomType;
        this.Price = Price;
    }


}
