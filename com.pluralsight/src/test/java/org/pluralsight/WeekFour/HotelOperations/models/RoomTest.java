package org.pluralsight.WeekFour.HotelOperations.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void RoomTesting() {
        Room newRoom = new Room();
        newRoom.checkIn();

        assertEquals(true, newRoom);
    }
}