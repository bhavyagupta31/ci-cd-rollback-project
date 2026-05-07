package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "This is my first programm";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}