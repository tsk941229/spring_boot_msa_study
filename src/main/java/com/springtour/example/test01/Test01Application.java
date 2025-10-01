package com.springtour.example.test01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
//@SpringBootApplication
public class Test01Application {

    public static void main(String[] args) {
//        SpringApplication.run(Test01Application.class, args);

        List<String> list = new ArrayList<>();
        PizzaStore pizzaStore1 = new PizzaStore(new BikeDelivery());
        pizzaStore1.orderPizza("페퍼로니 피자");

    }

}
