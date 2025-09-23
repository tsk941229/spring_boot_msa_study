package com.springtour.example.chapter02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class Chapter02Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Chapter02Application.class, args);

        Environment env = ctx.getBean(Environment.class);
        String port = env.getProperty("server.port");
        log.info("Customize Port: {}", port);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(beanName -> log.info("Bean Name : {}", beanName));


    }

}
