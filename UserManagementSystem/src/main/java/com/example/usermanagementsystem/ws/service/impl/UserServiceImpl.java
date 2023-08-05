package com.example.usermanagementsystem.ws.service.impl;

import com.example.usermanagementsystem.ws.model.UserEntity;
import com.example.usermanagementsystem.ws.repository.UserRepository;
import com.example.usermanagementsystem.ws.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public UserEntity deleteById(Long id) {
        UserEntity user = userRepository.findById(id).get();
        userRepository.deleteById(id);
        return user;
    }


}
