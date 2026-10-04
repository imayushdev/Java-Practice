package com.example.studentapi.service;

import com.example.studentapi.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    private final List<Student> list = new ArrayList<>();

    public StudentService() {
        list.add(new Student(101, 87, "Ayush"));
        list.add(new Student(102, 88, "Aryan Sharma"));
    }

    public List<Student> getAllStudent() {
        return list;

    }
    public Student getStudentById(int id){
        for(Student student:list){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }





}
