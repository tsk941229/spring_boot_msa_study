package com.springtour.example.chapter03;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private Sender messageSender;

    public NotificationService(@Qualifier("smsSender") Sender messageSender) {
        this.messageSender = messageSender;
    }

    public boolean sendNotification(Object object, String message) {

        return messageSender.sendText(object, message);

    }

}
