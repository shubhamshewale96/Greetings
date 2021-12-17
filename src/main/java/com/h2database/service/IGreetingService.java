package com.h2database.service;

import com.h2database.Model.Greeting;
import com.h2database.Model.User;

import java.util.List;
import java.util.Optional;


public interface IGreetingService {
    Greeting greetingMessage();
    Greeting addGreeting(User user);
    Optional<Greeting> getGreetingById(Long id);
    List<Greeting> getAllGreeting();
    void updateGreetingById(Greeting greeting, long id);
}
