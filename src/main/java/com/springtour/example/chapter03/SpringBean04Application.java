package com.springtour.example.chapter03;

import com.springtour.example.chapter03.domain.format.Formatter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@SpringBootApplication
public class SpringBean04Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringBean04Application.class);

        Formatter formatter = applicationContext.getBean("localDateTimeFormatter", Formatter.class);
        String dateString = formatter.of(LocalDateTime.now());
        log.info("Date : {}", dateString);

        applicationContext.close();
    }
}
