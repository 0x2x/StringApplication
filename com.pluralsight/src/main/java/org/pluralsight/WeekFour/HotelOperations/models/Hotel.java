package org.pluralsight.WeekFour.HotelOperations.models;

import java.util.ArrayList;

public class Hotel {
    private static ArrayList<Room> RoomList = new ArrayList<>();
    private static ArrayList<Room> BookedInventory = new ArrayList<>();
    private int bookedSuites = 0;
    private int bookedBasicRooms = 0;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        int bookedSuites = 0;
        int bookedBasicRooms = 0;
        int index = 0;
        int GenerateRooms = 100;
        boolean IsSuite = true;
        while (index < GenerateRooms) {
            Room newRoom = new Room();
            int RandomMath = (int) Math.round(Math.random());
            newRoom.setSuite(RandomMath == 1);
            newRoom.setPrice(250);
            newRoom.setNumberOfBeds(1);
            newRoom.setIsAvailable(true);
            newRoom.setIsDirty(false);
            newRoom.setIsOccupied(false);
            RoomList.add(newRoom);
            index++;

        }
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        int index = 0;
        int GenerateRooms = 100;
        boolean IsSuite = true;
        while (index < GenerateRooms) {
            Room newRoom = new Room();
            int RandomMath = (int) Math.round(Math.random());
            newRoom.setSuite(RandomMath == 1);
            newRoom.setPrice(250);
            newRoom.setNumberOfBeds(1);
            newRoom.setIsAvailable(true);
            newRoom.setIsDirty(false);
            newRoom.setIsOccupied(false);
            RoomList.add(newRoom);
            index++;

        }
    }


    // methods
    public boolean bookRoom(int numberOfRooms, boolean isSuite) { // adds x amount of booked rooms
        for (int i = 0; i < numberOfRooms; i++) {
            if(isSuite) {
                for (int j = 0; j < RoomList.size(); j++) {
                    if(RoomList.get(i).isSuite()) {
                        BookedInventory.add(RoomList.get(i));
                    }
                }
            }else {
                for (int j = 0; j < RoomList.size(); j++) {
                    if(!RoomList.get(i).isSuite()) {
                        BookedInventory.add(RoomList.get(i));
                    }
                }
            }
        }
        return true;
    }


}
