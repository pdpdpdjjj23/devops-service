package com.example.devops_service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
public class Appcontroller {
    @GetMapping("/")
    public String index() {
        return "Hello world";
    }
    
}
