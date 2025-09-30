package com.springtour.example.chapter03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.Printer;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class OrderPrinter implements Printer<Object> {

    /* 필드 주입 */
    @Autowired
    @Qualifier("localDateTimeFormatter")
    private Formatter formatter;

    private Formatter formatter02;

    /* setter 주입 */
    public void setFormatter02(@Qualifier("localDateTimeFormatter") Formatter formatter) {
        this.formatter02 = formatter;
    }

    private Formatter formatter03;

    /* 생성자 주입 */
    @Autowired
    public OrderPrinter(@Qualifier("localDateTimeFormatter") Formatter formatter03) {
        this.formatter03 = formatter03;
    }

    @Override
    public String print(Object object, Locale locale) {
        return "";
    }
}
