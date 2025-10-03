package org.pluralsight.weektwo.opp.SupportTicket;

import java.time.LocalDate;
import java.util.ArrayList;

public class SupportTicket {
    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        ArrayList<String> ValidOptions = new ArrayList<String>();
        ValidOptions.add("OPEN");
        ValidOptions.add("IN_PROGRESS");
        ValidOptions.add("RESOLVED");

        if(!ValidOptions.contains(status)) {
            this.status = "OPEN";
        } else {
            this.status = status;
        }
    }

    private String reporter;
    private String assignee;
    private String subject;
    private  String description;
    private LocalDate createdOn;
    private String status;


    public void printSummary() {
        System.out.printf("\n[%s] %s — %s (reported by %s, assigned to %s)", createdOn, subject, status, reporter, assignee);
    }



}
