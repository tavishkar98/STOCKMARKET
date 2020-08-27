package com.example.userservice.services;

import com.example.userservice.dtos.UserRequestModel;
import com.example.userservice.dtos.UserResponseModel;

public interface UserService {
    public UserResponseModel addUser(UserRequestModel userRequestModel);
    public UserResponseModel updateUser(UserRequestModel userRequestModel);
}
