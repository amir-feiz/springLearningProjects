package com.example.usermanagementsystem.ws.repository;

import com.example.usermanagementsystem.ws.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
