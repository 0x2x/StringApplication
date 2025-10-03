package org.pluralsight.weektwo.opp.TextMessage;

import java.time.LocalDate;
public class TextMessage {
    public TextMessage() {

    }
    public TextMessage(String senderNumber, String receiverNumber, String body, LocalDate sentOn) {
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.body = body;
        this.sentOn = sentOn;
    }
    public String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getSentOn() {
        return sentOn;
    }

    public void setSentOn(LocalDate sentOn) {
        this.sentOn = sentOn;
    }

    private String senderNumber;
    private String receiverNumber;
    private String body;
    private LocalDate sentOn;


    public void display() {
        System.out.printf("\n%s SMS from %s to %s: %s\n", this.sentOn, this.senderNumber, this.receiverNumber, this.body);
    }
}
