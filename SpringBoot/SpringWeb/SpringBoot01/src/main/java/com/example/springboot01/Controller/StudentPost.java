package com.example.springboot01.Controller;

import com.example.springboot01.DTO.StudentRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentPost {
    @PostMapping("/create")
    public String CreateStudent(@RequestBody StudentRequest request) {
        return "Student Created "+ request.getName();


    }
}
