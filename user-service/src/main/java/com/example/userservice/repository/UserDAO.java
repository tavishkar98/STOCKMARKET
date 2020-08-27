package com.example.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userservice.models.User;

@Repository
public interface UserDAO extends JpaRepository<User, String> {

}
