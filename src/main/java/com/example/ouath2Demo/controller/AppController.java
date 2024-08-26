package com.example.ouath2Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {
    @GetMapping("/")
    public String home() {
        return "Hello, server is running ...";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, server is running after sign in ...";
    }
    @GetMapping("/session-timeout")
    public String sessionTimeout() {
        return "Your session has timed out. Please log in again.";
    }

    @GetMapping("/session-expired")
    public String sessionExpired() {
        return "Your session has expired. Please log in again.";
    }

}
