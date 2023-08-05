package com.example.usermanagementsystem.ws.service.impl;

import com.example.usermanagementsystem.ws.model.UserEntity;
import com.example.usermanagementsystem.ws.repository.UserRepository;
import com.example.usermanagementsystem.ws.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }


}
