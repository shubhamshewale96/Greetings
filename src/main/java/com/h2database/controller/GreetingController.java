package com.h2database.controller;

import com.h2database.Model.Greeting;

import com.h2database.Model.User;

import com.h2database.service.IGreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {


    /*private static final String template = "Hello,%s!";
    private final AtomicLong counter = new AtomicLong();*/

   /* @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }*/

    @Autowired
    private IGreetingService greetingService;

    @GetMapping("greeting/hello")
    public Greeting greeting() {
        return greetingService.greetingMessage();

    }

    @GetMapping(value={"", "/", "/greeting"})
    public Greeting greeting(@RequestParam(value = "firstName", defaultValue = "World") String firstName,
                             @RequestParam(value = "lastName", defaultValue = "") String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

}
