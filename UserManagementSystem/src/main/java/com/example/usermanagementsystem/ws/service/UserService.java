package com.example.usermanagementsystem.ws.service;

import com.example.usermanagementsystem.ws.model.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public UserEntity createUser(UserEntity user);
}
