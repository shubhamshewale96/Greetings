package com.h2database.controller;

import com.h2database.Model.Greeting;

import com.h2database.Model.User;

import com.h2database.service.IGreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping (method = RequestMethod.POST ,value={"", "/", "/greeting"})
    public Greeting greeting(@RequestParam(value = "firstName", defaultValue = "World") String firstName,
                             @RequestParam(value = "lastName", defaultValue = "") String lastName) {
        User user = new User(firstName, lastName);

        return greetingService.addGreeting(user);
    }
    @GetMapping("/greeting/{id}")
    public Optional<Greeting> findById(@PathVariable Long id){

        return greetingService.getGreetingById(id);
    }
    @GetMapping(value = "/getAllGreeting")
    public List<Greeting> getGreetingAllById() {
        return greetingService.getAllGreeting();
    }
}
