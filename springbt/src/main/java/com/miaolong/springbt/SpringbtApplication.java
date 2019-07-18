package com.miaolong.springbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
@ComponentScan("com.miaolong.springbt")
public class SpringbtApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbtApplication.class, args);
    }

}
