package com.example.restapi.controller;

import com.example.restapi.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/get-students")
    public List<Student> sendStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("amir", "feiz","amir-uname","1"));
        students.add(new Student("ali", "alavi","ali-uname","2"));
        students.add(new Student("hossein", "hosseini","hossein-uname","3"));
        students.add(new Student("mamad", "mamadi","mamad-uname","4"));

        return students;
    }

    @GetMapping("get-student/{name}/{family}/{username}/{password}")
    public Student pathVariableStudent(@PathVariable String name,
                                       @PathVariable String family,
                                       @PathVariable String username,
                                       @PathVariable String password
                                       ){
        return new Student(name,family,username,password);
    }

    @GetMapping("/get-student-params")
    public Student pramStudent(@RequestParam String name,
                               @RequestParam String family,
                               @RequestParam String username,
                               @RequestParam String password
    ){
        return new Student(name,family,username,password);
    }

}
