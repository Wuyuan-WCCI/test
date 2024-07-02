package com.example.test;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/hello")
    @CrossOrigin(origins = "http://localhost:5173")
    public String hello() {
        return "Hello, World!\n 你好，世界";
    }
}
