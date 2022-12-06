package com.jpa.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootStarter.class, args);
    }
}
