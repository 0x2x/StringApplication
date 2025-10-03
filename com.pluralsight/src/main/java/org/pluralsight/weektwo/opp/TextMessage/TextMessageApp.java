package org.pluralsight.weektwo.opp.TextMessage;

import java.time.LocalDate;

public class TextMessageApp {
    static void main() {
        TextMessage message = new TextMessage();
        message.setSenderNumber("+3 1611111111");
        message.setReceiverNumber("+3 1622222222");
        message.setBody("On My Way!");
        message.setSentOn(LocalDate.now());
        message.display();

        TextMessage messageOne = new TextMessage();
        messageOne.setSenderNumber("+3 512314124123");
        messageOne.setReceiverNumber("+3 1611111111");
        messageOne.setBody("On My Way!");
        messageOne.setSentOn(LocalDate.now());
        messageOne.display();

    }

}
