package com.h2database.service;

import com.h2database.Model.Greeting;
import com.h2database.Model.User;


public interface IGreetingService {
    Greeting greetingMessage();
    Greeting addGreeting(User user);


}
