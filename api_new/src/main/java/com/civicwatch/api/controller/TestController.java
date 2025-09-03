package com.civicwatch.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testEndpoint() {
        System.out.println("--- ✅ TEST ENDPOINT WAS CALLED SUCCESSFULLY ---");
        return "Hello World! The server is working.";
    }
}