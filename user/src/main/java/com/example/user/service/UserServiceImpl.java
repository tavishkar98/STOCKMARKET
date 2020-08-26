package com.example.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.user.shared.Authentication;
import com.example.user.shared.Credentials;
import com.example.user.dao.UserDao;
import com.example.user.model.User;

@Service
//@EnableTransactionManagement
public class UserServiceImpl implements UserService{

//	  	@Autowired
	    private UserDao userDao;
	    
	    
	  	
		public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
}
		@Transactional
	    public void saveUser(User user){
	        userDao.save(user);
	    }
	    public Authentication verify(Credentials credentials){
	        Authentication authentication = new Authentication();
	        User user = userDao.findUserByUsername(credentials.getUserName());
	        if(user.getPassword().equals(credentials.getPassword()))
	            authentication.verified=true;
	        else
	            authentication.verified=false;
	        return authentication;
	    }
	
	
	
}
