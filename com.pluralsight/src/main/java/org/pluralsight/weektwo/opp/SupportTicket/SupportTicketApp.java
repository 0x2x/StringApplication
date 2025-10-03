package org.pluralsight.weektwo.opp.SupportTicket;

import java.time.LocalDate;

public class SupportTicketApp {
    static void main() {
        SupportTicket ST = new SupportTicket();
        ST.setAssignee("Nigel");
        ST.setSubject("APp Broken");
        ST.setDescription("App Broken doesn't work");
        ST.setCreatedOn(LocalDate.now());
        ST.setStatus("OPEN");
        ST.setReporter("Ray");
        ST.printSummary();

        ST.setStatus("RESOLVED");
        ST.printSummary();

    }
}
