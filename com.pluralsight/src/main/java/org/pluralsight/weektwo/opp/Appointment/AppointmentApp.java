package org.pluralsight.weektwo.opp.Appointment;

import java.time.LocalDate;

public class AppointmentApp {
    static void main() {
        Appointment SchduledAppontment = new Appointment();
        SchduledAppontment.setLocation("aw");
        SchduledAppontment.setAttendee("Nigel");
        SchduledAppontment.setDate(LocalDate.now());
        SchduledAppontment.setOrganizer("Doc");
        SchduledAppontment.setTitle("nigel is cool");
        SchduledAppontment.printDetails();

        Appointment SchduledAppontmentTwo = new Appointment("Nigel is awesome", "people", "nigel", LocalDate.now(), null);
        SchduledAppontmentTwo.printDetails();
    }
}
