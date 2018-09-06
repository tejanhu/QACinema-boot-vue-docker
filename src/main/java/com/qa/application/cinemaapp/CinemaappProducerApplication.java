package com.qa.application.cinemaapp;

import com.qa.application.cinemaapp.controller.MovieDataController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaappProducerApplication {

    MovieDataController test = new MovieDataController();

    public static void main(String[] args) {
        SpringApplication.run(CinemaappProducerApplication.class, args);
    }
}
