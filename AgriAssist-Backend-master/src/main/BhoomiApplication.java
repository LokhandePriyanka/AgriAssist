package com.kletech.bhoomi.application_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kletech.bhoomi")
public class BhoomiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BhoomiApplication.class, args);
    }

}
