package com.example.SpringInitializer.messagingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingApplication {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
}
