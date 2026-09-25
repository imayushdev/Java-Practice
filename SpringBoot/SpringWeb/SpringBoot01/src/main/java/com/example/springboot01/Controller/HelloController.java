package com.example.springboot01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/students")
    public List<String> Student(){
        return List.of("Ayush","Aryan");
    }
}
