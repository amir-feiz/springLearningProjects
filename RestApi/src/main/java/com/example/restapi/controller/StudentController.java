package com.example.restapi.controller;

import com.example.restapi.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping("/get")
    public Student sendStudent(){
        return new Student(
                "amir",
                "feiz",
                "amir-uname",
                "1234"
        );
    }

    @GetMapping("/get-all")
    public List<Student> sendStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("amir", "feiz","amir-uname","1"));
        students.add(new Student("ali", "alavi","ali-uname","2"));
        students.add(new Student("hossein", "hosseini","hossein-uname","3"));
        students.add(new Student("mamad", "mamadi","mamad-uname","4"));

        return students;
    }

    @GetMapping("get/{name}/{family}/{username}/{password}")
    public Student pathVariableStudent(@PathVariable String name,
                                       @PathVariable String family,
                                       @PathVariable String username,
                                       @PathVariable String password
                                       ){
        return new Student(name,family,username,password);
    }

    @GetMapping("/get-params")
    public Student pramStudent(@RequestParam String name,
                               @RequestParam String family,
                               @RequestParam String username,
                               @RequestParam String password
    ){
        return new Student(name,family,username,password);
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return new Student(student.getName(),student.getFamily(),
                student.getUsername(),student.getPassword());
    }

    @PutMapping("/{id}/update")
    public Student updateStudent(@RequestBody Student student,@PathVariable String id){
        log.info("student " + id + " has been updated");
        return new Student(student.getName(),student.getFamily(),
                student.getUsername(),student.getPassword());
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Student> deleteStudent(@PathVariable String id){
        log.info("student " + id + " has been deleted");
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
