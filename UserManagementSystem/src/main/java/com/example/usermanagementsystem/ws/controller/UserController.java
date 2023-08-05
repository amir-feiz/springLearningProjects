package com.example.usermanagementsystem.ws.controller;

import com.example.usermanagementsystem.ws.model.UserEntity;
import com.example.usermanagementsystem.ws.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);

    }

    @GetMapping("getAll")
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    @GetMapping("get/{id}")
    public ResponseEntity<UserEntity> getUser(@PathVariable Long id){
        return new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<UserEntity> deleteUser(@PathVariable Long id){
        return new ResponseEntity<>(userService.deleteById(id),HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable Long id,@RequestBody UserEntity user){
        return new ResponseEntity<>(userService.updateById(user,id),HttpStatus.OK);
    }
}