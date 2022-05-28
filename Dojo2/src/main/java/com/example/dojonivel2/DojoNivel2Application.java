package com.example.dojonivel2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@EnableReactiveMongoRepositories
@SpringBootApplication
public class DojoNivel2Application {

    public static void main(String[] args) {
        SpringApplication.run(DojoNivel2Application.class, args);
    }

}
