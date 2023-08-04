package com.example.usermanagementsystem.ws.service.impl;

import com.example.usermanagementsystem.ws.repository.UserRepository;
import com.example.usermanagementsystem.ws.service.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


}
