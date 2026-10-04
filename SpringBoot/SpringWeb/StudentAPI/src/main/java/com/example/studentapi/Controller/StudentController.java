package com.example.studentapi.Controller;

import com.example.studentapi.Model.Student;
import com.example.studentapi.service.CourseService;
import com.example.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/students")      //not again /student in every class
public class StudentController {
   // @Autowired if class only one const then its optional
    public StudentController(StudentService service,CourseService courseService) {//created so controller can access service
        /*
        Both objects injecting through single constructor so if one affected code will break down
         */
        this.service = service;
        this.courseService=courseService;
    }
//--------------------------------------------------------------------------------
    //production ready course

    // put mandatory dependency in constructor
    public StudentController(StudentService service) {
        this.service = service;
    }

    //optional dependency in setter and set false
     @Autowired(required = false)
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    //------------------------------------------------------------------------------

    // @Autowired  means field dependency inj spring identify and inject this dependency wherever need
    private StudentService service;
    private CourseService courseService;

    //@Autowired its setter injection put this annotation above setter method
    public void setService(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudent( ){

        return service.getAllStudent();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){

        Student student=service.getStudentById(id);

        if(student==null){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(student);
    }




}
