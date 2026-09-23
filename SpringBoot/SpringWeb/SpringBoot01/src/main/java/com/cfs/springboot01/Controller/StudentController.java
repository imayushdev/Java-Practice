package com.cfs.springboot01.Controller;

import com.cfs.springboot01.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    public Student student;
        @GetMapping("/student")
        public Student getStudent() {

            return new Student(1, "Ayush", 33);
        }

        @GetMapping("/student/{id}")            //path Variable

        public String getStudentById(@PathVariable int id){
            return "Student Id is : "+id;

        }
          @GetMapping("/student/search")
        public String SearchStudent(@RequestParam String course)
        {
            return "Search Student for Course "+course;
        }

        @GetMapping("/product/search")       //means must to pass                         //can pass default value like this
    public String SearchProduct(@RequestParam(required = true) String cat,@RequestParam(defaultValue = "11999") String minPrice)
    {
        return "Product Category is "+ cat +"And Minimum price is "+minPrice;
    }


    //post Mapping




}
