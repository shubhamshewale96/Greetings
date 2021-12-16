package com.h2database.service;

import com.h2database.Model.Greeting;


import com.h2database.Model.User;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{

        public Greeting greetingMessage() {
            String template = "Hello world";
            AtomicLong counter = new AtomicLong();

            return new Greeting(counter.incrementAndGet(), String.format(template));
        }




    @Override
    public Greeting addGreeting(User user) {
        String template = "Hello, %s!";
        AtomicLong counter = new AtomicLong();
        //Elvis Operator
        String message = String.format(template, (user.toString().isEmpty())? "World" :
                user.getFirstName().isEmpty()? user.getLastName() : user.getLastName().isEmpty()? user.getFirstName() :
                        user.getFirstName() + " " + user.getLastName());
        return  (new Greeting(counter.incrementAndGet(), message));

    }


}
