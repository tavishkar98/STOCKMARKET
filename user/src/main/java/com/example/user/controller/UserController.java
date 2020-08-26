package com.example.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.service.UserService;
import com.example.user.shared.Authentication;
import com.example.user.shared.Credentials;

@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/user")
public class UserController {

//    @Autowired
    UserService userService;
    
    
    
//    public UserController(UserService userService) {
//		super();
//		this.userService = userService;
//	}

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}



	@RequestMapping(method = RequestMethod.POST,value = "/verify")
    public ResponseEntity<Authentication> findAll(@RequestBody Credentials credentials){
        return ResponseEntity.status(HttpStatus.OK).body(userService.verify(credentials));
    }
	    
	
	
}
