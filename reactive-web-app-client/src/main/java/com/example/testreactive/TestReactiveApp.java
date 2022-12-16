package com.example.testreactive;

import com.example.testreactive.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
public class TestReactiveApp {
    public static void main(String[] args) {
        SpringApplication.run(TestReactiveApp.class, args);
    }
}
