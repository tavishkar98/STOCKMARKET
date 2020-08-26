package com.example.user.service;

import com.example.user.model.User;
import com.example.user.shared.Authentication;
import com.example.user.shared.Credentials;

public interface UserService {
	
	public void saveUser(User user);
    public Authentication verify(Credentials credentials);

}
