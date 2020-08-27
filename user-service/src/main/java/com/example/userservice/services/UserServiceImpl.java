package com.example.userservice.services;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.dtos.UserRequestModel;
import com.example.userservice.dtos.UserResponseModel;
import com.example.userservice.models.User;
import com.example.userservice.repository.UserDAO;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDAO userDAO;
	@Autowired
    private ModelMapper modelMapper;

    public UserServiceImpl(UserDAO userDAO, ModelMapper modelMapper) {
        this.userDAO = userDAO;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserResponseModel addUser(UserRequestModel userRequestModel) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        String str = UUID.randomUUID().toString();
        User user = modelMapper.map(userRequestModel,User.class);
        user.setId(str);
        userDAO.save(user);
        return modelMapper.map(user,UserResponseModel.class);
    }

    @Override
    public UserResponseModel updateUser(UserRequestModel userRequestModel) {
        userDAO.save(modelMapper.map(userRequestModel, User.class));
        Optional<User> optionalUser = userDAO.findById(userRequestModel.getId());
        User user = optionalUser.get();
        return modelMapper.map(user, UserResponseModel.class);
    }
}
