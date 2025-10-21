package org.pluralsight.WeekFour.HotelOperations.models;

public class Room {
    private  int NumberOfBeds;
    private  double Price;
    private  boolean isOccupied;
    private  boolean isDirty;
    private  boolean isAvailable;

    public boolean checkIn(){
        if (!isDirty) { // if dirty is false, room is good
            isDirty = true;
            isOccupied = true;
            return true;
        }
        return false; // if dirty is already true, room is bad

    }
    public void checkOut(){
        isDirty = false;
        isOccupied = false;
    }
    public void cleanRoom(){}


    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    public  void setNumberOfBeds(int numberOfBeds) {
        NumberOfBeds = numberOfBeds;
    }

    public  double getPrice() {
        return Price;
    }

    public  void setPrice(double price) {
        Price = price;
    }

    public  boolean isIsOccupied() {
        return isOccupied;
    }

    public  void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public  boolean isIsDirty() {
        return isDirty;
    }

    public  void setIsDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

    public  boolean IsAvailable() {
        if (!isDirty && !isOccupied) {
            return true;
        } {
            return false;
        }
    }

    public  void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    //
    public Room() {}
    public Room(int NumberOfBeds, double Price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.NumberOfBeds = NumberOfBeds;
        this.Price = Price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }
}
