package com.example.tutorial.controller;


import com.example.tutorial.ExampleChild;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(path="/", method = RequestMethod.GET)
    public void getGreeting() {
    }
}
