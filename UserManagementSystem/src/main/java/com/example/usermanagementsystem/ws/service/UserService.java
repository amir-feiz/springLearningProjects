package com.example.usermanagementsystem.ws.service;

import com.example.usermanagementsystem.ws.model.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserEntity createUser(UserEntity user);
    List<UserEntity> getAllUsers();
    UserEntity findById(Long id);
    UserEntity deleteById(Long id);

    UserEntity updateById(UserEntity user,Long id);
}
