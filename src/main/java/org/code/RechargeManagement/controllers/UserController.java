package org.code.RechargeManagement.controllers;

import org.code.RechargeManagement.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")

public class UserController {
	
Map<String,User> allUsers = new HashMap<>();
	
	@GetMapping
	public Collection<User> getMethod(){
		return allUsers.values();
	}
	
	@PostMapping
	public String postMethod(@RequestBody User userdetails){
		User addValue = new User();
		addValue.setName(userdetails.getName());
		addValue.setEmail(userdetails.getEmail());
		addValue.setPhonenumber(userdetails.getPhonenumber());
		addValue.setPassword(userdetails.getPassword());
		allUsers.put(userdetails.getName(),addValue );
		return "user added";
	}
}
