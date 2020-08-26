package com.example.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import com.example.user.dao.UserDao;
import com.example.user.model.User;
import com.example.user.service.UserService;

@EnableEurekaClient
@SpringBootApplication
public class UserApplication implements CommandLineRunner {
	
//	@Autowired
	private UserDao userDao;
	
	
	public UserApplication(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	public static void main(String[] args) {
		
				SpringApplication.run(UserApplication.class, args);
				// initializing sample data while starting the server
//				UserService userService= app.getBean(UserService.class);
//				userService.saveUser(new User(1, "admin","admin", "admin", 9999999,"yes"));
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		userDao.save(new User(1,"admin","admin","admin",999999,"yes"));
		
		
	}

}
