package com.springtour.example.chapter03;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmsSender implements Sender {

    @Override
    public boolean sendText(Object user, String message) {
        log.info("SMS SENDER");
        return true;
    }
}
