package com.springtour.example.chapter03;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@SpringBootApplication
public class SpringBean08Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBean08Application.class, args);

        Object obj = context.getBean("systemId");
        log.warn("Bean Info. type:{}, value:{}", obj.getClass(), obj);
        context.close();

    }

    @Configuration
    class SystemConfig1 {

        @Bean
        public Long systemId() {
            return 1111L;
        }

    }

    @Configuration
    class SystemConfig2 {

//        @Bean
        public String systemId() {
            return new String("OrderSystem");
        }

    }

}
