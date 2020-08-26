package com.example.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.model.User;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    public User findUserByUsername(String username);

}
