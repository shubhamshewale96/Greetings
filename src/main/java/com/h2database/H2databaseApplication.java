package com.h2database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class H2databaseApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(H2databaseApplication.class, args);
        System.out.println(context.getBean(H2databaseApplication.class));
    }

}
