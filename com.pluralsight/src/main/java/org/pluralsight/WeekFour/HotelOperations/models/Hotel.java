package org.pluralsight.WeekFour.HotelOperations.models;

import java.util.ArrayList;

public class Hotel {
    private static ArrayList<Room> RoomList = new ArrayList<>();
    static {
//    public Room(int NumberOfBeds, double Price, boolean isOccupied, boolean isDirty, boolean isAvailable) {

        RoomList.add(new Room(2, 250, false, false, true));
        RoomList.add(new Room(1, 125, true, false, false));
        RoomList.add(new Room(2, 250, true, false, false));
        RoomList.add(new Room(1, 125, false, false, true));
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {}
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {}

    public static void bookRoom(int numberOfRooms, boolean isSuite) {

    }

    public static void getAvailableSuites() {}
    public static void getAvailableRooms() {}


}
