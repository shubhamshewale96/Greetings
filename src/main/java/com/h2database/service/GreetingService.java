package com.h2database.service;

import com.h2database.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    private static final String template = "Hello world";
    private final AtomicLong counter = new AtomicLong();

        public Greeting greetingMessage() {
            return new Greeting(counter.incrementAndGet(), String.format(template));
        }

}
