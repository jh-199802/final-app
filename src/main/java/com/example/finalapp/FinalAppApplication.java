package com.example.finalapp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class FinalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalAppApplication.class, args);
    }

}
