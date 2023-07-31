package com.example.restapi.controller;

import com.example.restapi.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/get-student")
    public Student sendStudent(){
        return new Student(
                "amir",
                "feiz",
                "amir-uname",
                "1234"
        );
    }

}
